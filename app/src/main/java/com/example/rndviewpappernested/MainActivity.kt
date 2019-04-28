package com.example.rndviewpappernested

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rndviewpappernested.fragments.FragmentParent
import androidx.navigation.fragment.NavHostFragment



class MainActivity : AppCompatActivity() {

    private lateinit var parentFragment: FragmentParent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onResume() {
        super.onResume()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.content_frame)
        parentFragment = navHostFragment?.childFragmentManager?.fragments!![0] as FragmentParent
        var a = 5

    }

    override fun onBackPressed() {

        if (!parentFragment.onBackPressed()) {
            // container Fragment or its associates couldn't handle the back pressed task
            // delegating the task to super class
            super.onBackPressed()

        } else {
            // carousel handled the back pressed task
            // do not call super
        }
    }
}
