package com.example.rndviewpappernested.fragments

import androidx.fragment.app.Fragment
import com.example.rndviewpappernested.OnBackPressListner

open class RootFragment : Fragment(), OnBackPressListner {

    override fun onBackPress(): Boolean {
        return false
    }

}
