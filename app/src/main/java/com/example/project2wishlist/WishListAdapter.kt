package com.example.project2wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListAdapter (private val listItems: List<ListItem>) : RecyclerView.Adapter<WishListAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTextView: TextView
        val urlTextView: TextView
        val priceTextView: TextView

        init{
            itemTextView = itemView.findViewById(R.id.itemTV)
            urlTextView = itemView.findViewById(R.id.urlTV)
            priceTextView = itemView.findViewById(R.id.priceTv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.list_layout,parent, false)

        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listItems.get(position)

        holder.itemTextView.text = listItem.item
        holder.urlTextView.text = listItem.url
        holder.priceTextView.text = listItem.price
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

}