package com.loopapp.ui.fragment

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.loopapp.R

class AddHabitFragment : BaseFragment() {

    lateinit var btnAddHabit : LinearLayout

    init {
        initView()
    }

    companion object {
        fun newInstance() : AddHabitFragment {
            return AddHabitFragment()
        }
    }

    private fun initView() {

    }
}