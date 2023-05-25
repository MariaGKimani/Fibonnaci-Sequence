package com.mwangi.recycler_views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import mariadev.example.fibonnaciisequence.R

class valuesRVAdapter(var fibonacci:List<Int>): RecyclerView.Adapter<NumsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {
        val currentValue = fibonacci.get(position)
        holder.tvname.text = currentValue.toString()
    }

    override fun getItemCount(): Int {
        return fibonacci.size
    }
}

class NumsViewHolder(itemView:View):ViewHolder(itemView){
    var tvname = itemView.findViewById<TextView>(R.id.tvname)
}