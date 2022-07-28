package com.example.myfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfragmentdemo.databinding.FragmentBBinding
import com.example.myfragmentdemo.databinding.FragmentCBinding


class CFragment : Fragment() {
        private lateinit var binding: FragmentCBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            binding =  DataBindingUtil.inflate(inflater,
                R.layout.fragment_c, container, false)

            binding.btnToA.setOnClickListener(){
                Navigation.findNavController(binding.root)
                    .popBackStack()

            }
            return binding.root
        }
    }

