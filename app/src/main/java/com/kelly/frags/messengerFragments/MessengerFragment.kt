package com.kelly.frags.messengerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.kelly.frags.R
import com.kelly.frags.databinding.FragmentMessengerBinding
import com.kelly.frags.ui.MessengerAdapter

class MessengerFragment : Fragment() {
    private lateinit var binding: FragmentMessengerBinding
    private lateinit var messengerAdapter: MessengerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMessengerBinding.inflate(inflater, container, false)

        messengerAdapter = MessengerAdapter(this)

        binding.myViewPager.adapter = messengerAdapter
        binding.apply {
            TabLayoutMediator(myTabLayout, myViewPager) { tab, position ->
                when (position) {
                    0 -> tab.text = "Chats"
                    1 -> tab.text = "Favorites"
                    else -> tab.text = "Messenger"
                }
            }.attach()
        }

        return binding.root
    }
}