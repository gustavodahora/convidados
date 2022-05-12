package dev.gustavodahora.convidados.view.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.gustavodahora.convidados.R
import dev.gustavodahora.convidados.service.model.GuestModel

class GuestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(guest: GuestModel) {
        val textName = itemView.findViewById<TextView>(R.id.text_name)
        textName.text = guest.name
    }
}