package com.example.practice_xml_kay_written_ang_exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.practice_xml_kay_written_ang_exam.databinding.FragmentHomeBinding
import java.lang.RuntimeException


class HomeFragment : Fragment() {


    private lateinit var binding : FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater,container, false)
        binding.button.setOnClickListener {
            binding.textView.text = "You pressed the button!"
            Toast.makeText(requireContext(), "You Pressed the Button", Toast.LENGTH_SHORT).show()
        }
        return binding.root

    }
}