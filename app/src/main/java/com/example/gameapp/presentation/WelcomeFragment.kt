package com.example.gameapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gameapp.R
import com.example.gameapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    // принят такой подход с binding в Фрагментах, в сообществе Андроид разработчиков
    // чтобы если по какой-то причине обратиться в методах,
    // где View не доступно, чтобы был сразу краш - чтобы понять в чем проблема
    private var _binding: FragmentWelcomeBinding? = null
    private val binding: FragmentWelcomeBinding
        get() = _binding ?: throw RuntimeException("FragmentWelcomeBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
