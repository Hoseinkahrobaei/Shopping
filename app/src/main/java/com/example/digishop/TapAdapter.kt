package com.example.digishop

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TapAdapter (activity : FragmentActivity? , list : List<Fragment>) : FragmentStateAdapter(activity!!) {
    var list1 = list
    override fun getItemCount(): Int {
       return list1.size
    }

    override fun createFragment(position: Int): Fragment {
        return list1.get(position)
    }
}