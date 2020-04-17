package com.loopapp.ui.util

import androidx.fragment.app.Fragment

interface FragmentService {
    fun replaceFragment(fragment: Fragment)
    fun addFragment(fragment: Fragment)
    fun finishFragment()
}