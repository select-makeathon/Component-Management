package com.minosai.compoentmanager.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.minosai.compoentmanager.R
import com.minosai.compoentmanager.model.TeamModel
import com.minosai.compoentmanager.util.inflate
import kotlinx.android.synthetic.main.item_team.view.*

class TeamAdapter(
    var teams: ArrayList<TeamModel>,
    val listener: (TeamModel) -> Unit
) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TeamViewHolder(parent.inflate(R.layout.item_team))

    override fun getItemCount() = teams.size

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) = holder.bind(teams[position], listener)


    inner class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(team: TeamModel, listener: (TeamModel) -> Unit) = with(itemView) {
            text_team_name.text = team.teamName
            with(rv_components) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = ComponentAdapter(team.componentRequests) { componentRequestModel, position ->
                    team.componentRequests[position] = componentRequestModel
                    listener(team)
                }
            }
        }

    }

    fun updateData(teams: ArrayList<TeamModel>) {
        this.teams = teams
        notifyDataSetChanged()
    }
}