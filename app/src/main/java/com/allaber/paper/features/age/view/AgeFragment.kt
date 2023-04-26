package com.allaber.paper.features.age.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.paper.R
import com.allaber.paper.databinding.FragmentAgeBinding
import com.allaber.paper.extensions.activityNavController
import com.allaber.paper.extensions.navigateSafely

class AgeFragment : Fragment(R.layout.fragment_age) {

    private val binding: FragmentAgeBinding by viewBinding(
        FragmentAgeBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        setupButton()
    }

    private fun setupButton() {
        binding.button.setOnClickListener{
            activityNavController().navigateSafely(R.id.actionGlobalHomeFlowFragment)
        }
    }
}