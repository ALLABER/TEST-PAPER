package com.allaber.paper.features.home.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.paper.R
import com.allaber.paper.databinding.FragmentHomeBinding
import com.allaber.paper.extensions.activityNavController
import com.allaber.paper.extensions.navigateSafely
import com.allaber.paper.features.dialogs.ConfirmationDialog

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding: FragmentHomeBinding by viewBinding(
        FragmentHomeBinding::bind
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
            ConfirmationDialog.createInstance(
                title = "Title",
                description = "Description",
                buttonPositiveText = "Button positive text",
                buttonNegativeText = "Button negative text",
                buttonPositiveCallback = {
                    activityNavController().navigateSafely(R.id.actionGlobalAgeFlowFragment)
                },
                buttonNegativeCallback = {
                }
            ).show(parentFragmentManager, HomeFragment::class.simpleName)
        }
    }
}