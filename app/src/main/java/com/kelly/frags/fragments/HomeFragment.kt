package com.kelly.frags.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kelly.frags.R
import com.kelly.frags.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnNextPage.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }
}