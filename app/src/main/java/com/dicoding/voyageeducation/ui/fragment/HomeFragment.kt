package com.dicoding.voyageeducation.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.dicoding.voyageeducation.R
import com.dicoding.voyageeducation.databinding.FragmentHomeBinding
import com.dicoding.voyageeducation.ui.prequiz.PrequizActivity

class HomeFragment : Fragment() {

    private lateinit var btnStart: Button
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnStart = view.findViewById(R.id.start_button)

        btnStart.setOnClickListener {
            val intent = Intent(requireContext(), PrequizActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.root
    }
}