package com.example.rndviewpappernested.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.rndviewpappernested.R
import kotlinx.android.synthetic.main.fragment_a1.*

class A1Fragment : RootFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        a2.setOnClickListener {
//            Navigation.createNavigateOnClickListener(R.id.action_a1Fragment_to_a2Fragment)
            findNavController(it).navigate(R.id.action_a1Fragment_to_a2Fragment)

        }
//        findNavController(this).navigate(R.id.action_a1Fragment_to_a2Fragment)

    }
}
