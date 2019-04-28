package com.example.rndviewpappernested.fragments

import android.os.Bundle
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rndviewpappernested.FlowPagerAdapter
import com.example.rndviewpappernested.OnBackPressListner
import com.example.rndviewpappernested.R
import kotlinx.android.synthetic.main.fragment_parent.*

class FragmentParent : Fragment() {

    private lateinit var vpAdapter: FlowPagerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parent, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vpAdapter = FlowPagerAdapter(childFragmentManager)
        vpAdapter.addFragment( FragmentA() )
        vpAdapter.addFragment( FragmentB() )
        vpAdapter.addFragment(FragmentC() )
        vpAdapter.addFragment(FragmentD() )
        vpAdapter.addFragment(FragmentE() )

        flowVP.adapter = vpAdapter
    }


    /**
     * Retrieve the currently visible Tab Fragment and propagate the onBackPressed callback
     *
     * @return true = if this fragment and/or one of its associates Fragment can handle the backPress
     */
    fun onBackPressed(): Boolean {
        // currently visible tab Fragment
        val currentFragment = vpAdapter.getRegisteredFragment(flowVP.currentItem) as OnBackPressListner
        return currentFragment.onBackPress()

        // this Fragment couldn't handle the onBackPressed call
    }
}
