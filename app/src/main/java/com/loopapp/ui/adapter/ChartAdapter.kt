package com.loopapp.ui.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loopapp.R
import com.loopapp.ui.fragment.ChartFragment.Companion
import com.loopapp.ui.fragment.ChartFragment.Companion.STR_CHART_DONE
import com.loopapp.ui.fragment.ChartFragment.Companion.STR_CHART_FAIL
import com.loopapp.ui.fragment.ChartFragment.Companion.STR_CHART_STARTED
import kotlinx.android.synthetic.main.item_layout_chart.view.*
import kotlinx.android.synthetic.main.recycler_item.view.*

class ChartAdapter (val context: Context, val items : MutableMap<String, Int>) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout_chart, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var chartTitle : String = ""
        when (position) {
            0 -> chartTitle = STR_CHART_DONE
            1 -> chartTitle = STR_CHART_STARTED
            2 -> chartTitle = STR_CHART_FAIL
        }
        holder.title.text = chartTitle
        holder.title_num.text = items.get(chartTitle).toString()
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val title = view.tv_chart_state
    val title_num = view.tv_chart_state_num
}