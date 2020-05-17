package com.loopapp.ui.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loopapp.R
import kotlinx.android.synthetic.main.recycler_item.view.*

class HabitAdapter (private val items : ArrayList<String>, private val context: Context) : RecyclerView.Adapter<HabitViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        return HabitViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
//        holder?.icon?.drawable = items.get(position) as Drawable
        holder.title.text = items.get(position)
    }
}

class HabitViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
//    val icon = view.iv_habit_icon
    val title = view.tv_habit_title
}