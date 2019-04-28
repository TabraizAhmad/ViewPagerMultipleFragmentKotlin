package com.example.rndviewpappernested

import android.util.SparseArray
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import android.view.ViewGroup


class FlowPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    private var mFragmentList: ArrayList<Fragment> = ArrayList()

    internal var registeredFragments = SparseArray<Fragment>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fr: Fragment ){
        mFragmentList.add(fr)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val fragment = super.instantiateItem(container, position) as Fragment
        registeredFragments.put(position,fragment)
        return fragment
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        registeredFragments.remove(position)
        super.destroyItem(container, position, `object`)
    }


    fun getRegisteredFragment(position: Int): Fragment {
        return registeredFragments.get(position)
    }

}