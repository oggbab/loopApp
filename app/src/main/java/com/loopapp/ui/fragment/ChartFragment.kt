package com.loopapp.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.loopapp.R
import com.loopapp.ui.adapter.ChartAdapter
import com.loopapp.ui.adapter.HabitAdapter
import com.ramijemli.percentagechartview.PercentageChartView

class ChartFragment : Fragment() {

    lateinit var adapter : ChartAdapter
    lateinit var chartStateList : MutableMap<String, Int>
    lateinit var chartView: PercentageChartView
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_chart, container, false)
        recyclerView = root.findViewById<RecyclerView>(R.id.recycler_chart)
        chartView = root.findViewById(R.id.chart_view)
        setAdapter()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setAdapter() {
        chartStateList = mutableMapOf(STR_CHART_DONE to 1, STR_CHART_STARTED to 1, STR_CHART_FAIL to 0)
        adapter = ChartAdapter(activity as Context, chartStateList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(activity, 3)
    }

    private fun setChartProgress(value : Float, isAnimate : Boolean = true) {
        chartView.setProgress(value, isAnimate)
    }

    companion object {
        const val STR_CHART_DONE = "DONE"
        const val STR_CHART_STARTED = "STARTED"
        const val STR_CHART_FAIL = "FAIL"
    }
}
