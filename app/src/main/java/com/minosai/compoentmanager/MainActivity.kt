package com.minosai.compoentmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.minosai.compoentmanager.adapter.TeamAdapter
import com.minosai.compoentmanager.model.TeamModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val reference = FirebaseDatabase.getInstance().reference
    val teams = arrayListOf<TeamModel>()
    lateinit var teamAdapter: TeamAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        teamAdapter = TeamAdapter(teams) { teamModel ->
            reference.child("teams").child(teamModel.teamId).setValue(teamModel)
        }

        with(rv_teams) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = teamAdapter
        }

        reference.child("teams").addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                teams.clear()
                dataSnapshot.children.forEach {
                    var teamModel = it.getValue(TeamModel::class.java)
                    teamModel?.let { team ->

                        if (team.isSelected && team.componentRequests != null) {
                            teams.add(team)
                        }

                    }
                }
                updateRV()
            }

        })
    }

    private fun updateRV() {
        teamAdapter.updateData(teams)
    }
}
