package com.kelly.frags.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.kelly.frags.R
import com.kelly.frags.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            val name = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            if (name.isNotEmpty() && password.isNotEmpty()) {
                val action =
                    LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(name, password)
                Navigation.findNavController(it).navigate(action)
            } else {
                binding.apply {
                    etUsername.error = "Field cannot be empty"
                    etUsername.requestFocus()

                    etPassword.error = "Field cannot be empty"
                    etUsername.requestFocus()
                }
            }
        }

        return binding.root
    }
}