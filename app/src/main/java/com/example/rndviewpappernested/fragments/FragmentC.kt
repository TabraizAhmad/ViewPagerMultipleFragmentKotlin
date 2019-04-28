package com.example.rndviewpappernested.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.rndviewpappernested.R
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC : RootFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        c1.setOnClickListener {
            navigateToC2()
        }
        c2.setOnClickListener {
            navigateToC3()
        }
        c3.setOnClickListener {
            navigateToC4()
        }
        c4.setOnClickListener {
            navigateToC1()
        }

    }


    private fun navigateToC2() {
        findNavController(this).navigate(R.id.action_c1Fragment_to_c2Fragment)
    }

    private fun navigateToC3() {
        findNavController(this).navigate(R.id.action_c2Fragment_to_c3Fragment)
    }

    private fun navigateToC4() {

        findNavController(this).navigate(R.id.action_c3Fragment_to_c4Fragment)
    }

    private fun navigateToC1() {
        findNavController(this).navigate(R.id.action_c4Fragment_to_c1Fragment)
    }
}
