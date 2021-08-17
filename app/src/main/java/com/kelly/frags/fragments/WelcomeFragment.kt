package com.kelly.frags.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.kelly.frags.R
import com.kelly.frags.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private val args by navArgs<WelcomeFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)

        binding.apply {
            tvUsername.text = args.username
            tvPassword.text = args.password
        }

        binding.apply {
            btnHome.setOnClickListener {
                val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment2()
                Navigation.findNavController(it).navigate(action)
            }
            btnMessenger.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_messengerFragment)
            }
        }
        return binding.root
    }
}