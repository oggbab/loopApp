package com.loopapp.ui.fragment

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.loopapp.MainActivity
import com.loopapp.R
import com.loopapp.ui.adapter.HabitAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.layout_add_habit.*
import java.util.zip.Inflater

class HomeFragment : BaseFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var adapter: HabitAdapter
    private lateinit var addHabitView: AddHabitFragment
    private lateinit var recyclerView : RecyclerView
    private lateinit var btnAdd : LinearLayout

    private var habitList = ArrayList<String>()

    companion object {
        fun newInstance(param: Parcelable): HomeFragment {
//            val args = Bundle()
//            args.putParcelable(EXTRA_DATA, param)
            val fragment = HomeFragment()
//            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = rootView.findViewById<RecyclerView>(R.id.recycler_body) as RecyclerView
        btnAdd = rootView.findViewById(R.id.lin_add) as LinearLayout
        btnAdd.setOnClickListener {
            (activity as MainActivity).replaceFragment(AddHabitFragment.newInstance())
        }
        init()

        return rootView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun init() {
        setViewModel()
        setAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    private fun setAdapter() {
        for (i in 0..10) habitList.add(i,"축구")
        recyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = HabitAdapter(habitList, activity!!)
    }

    private fun setViewModel() {
/*
                dashboardViewModel =
        ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
        textView.text = it
        })
*/
    }

}
