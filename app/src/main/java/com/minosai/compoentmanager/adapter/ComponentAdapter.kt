package com.minosai.compoentmanager.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.minosai.compoentmanager.R
import com.minosai.compoentmanager.model.ComponentRequestModel
import com.minosai.compoentmanager.util.gone
import com.minosai.compoentmanager.util.inflate
import com.minosai.compoentmanager.util.show
import kotlinx.android.synthetic.main.item_component.view.*

class ComponentAdapter(
    var components: List<ComponentRequestModel>, var listener: (ComponentRequestModel, Int) -> Unit
) : RecyclerView.Adapter<ComponentAdapter.ComponentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ComponentViewHolder(parent.inflate(R.layout.item_component))

    override fun getItemCount() = components.size

    override fun onBindViewHolder(holder: ComponentViewHolder, position: Int) =
        holder.bind(components[position], listener, position)


    inner class ComponentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(
            componentRequestModel: ComponentRequestModel,
            lintener: (ComponentRequestModel, Int) -> Unit,
            position: Int
        ) = with(itemView) {

            text_component_name.text = componentRequestModel.componentName
            text_component_count.text = "count - ${componentRequestModel.count}"

            if (componentRequestModel.status == ComponentRequestModel.ComponentRequestStatus.PENDING) {
                image_approve.show()
            } else {
                image_approve.gone()
            }

            image_approve.setOnClickListener {
                componentRequestModel.status = ComponentRequestModel.ComponentRequestStatus.APPROVED
                listener(componentRequestModel, position)
            }

        }
    }

}