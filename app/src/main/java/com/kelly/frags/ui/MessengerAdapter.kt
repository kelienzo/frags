package com.kelly.frags.ui

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kelly.frags.messengerFragments.ChatFragment
import com.kelly.frags.messengerFragments.FavoritesFragment
import com.kelly.frags.messengerFragments.MessengerFragment

class MessengerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ChatFragment()
            1 -> FavoritesFragment()
            else -> MessengerFragment()
        }
    }
}