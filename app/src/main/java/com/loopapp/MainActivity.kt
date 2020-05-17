package com.loopapp

import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.transaction
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        setupNavi()
//        setToolbar()
//        setNaviListener()
    }

    private fun setupNavi() {
        NavigationUI.setupWithNavController(nav_view, findNavController(R.id.fr_nav_host))
    }

    private fun setToolbar() {
//        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun changeTitle(title: String) {
//        toolbar_title.text = src_title
    }

    companion object {
        var src_title = ""
        fun changeTitle(title: String) {
            src_title = title
        }
    }

    private fun setNaviListener() {
        nav_view.setOnNavigationItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.nav_home -> return@setOnNavigationItemSelectedListener true
            }
            false
        }
    }

    fun replaceFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fr_nav_host, fragment).commit()
    }
}
