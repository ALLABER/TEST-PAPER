package com.allaber.paper.features.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.allaber.paper.R
import com.allaber.paper.base.BaseDialogFragment
import com.allaber.paper.databinding.ConfirmationDialogBinding
import com.allaber.paper.gone
import com.allaber.paper.show

class ConfirmationDialog : BaseDialogFragment() {
    private var title: String? = ""
    private var description: String? = ""
    private var buttonPositiveText: String? = ""
    private var buttonNegativeText: String? = ""
    private lateinit var buttonPositiveCallback: () -> Unit?
    private lateinit var buttonNegativeCallback: () -> Unit?

    private lateinit var binding: ConfirmationDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ConfirmationDialogBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureViews()
        initListeners()
    }

    private fun configureViews() {
        configureDialogTitle()
        configureDialogDescription()
        configureButtonPositiveText()
        configureButtonNegativeText()
    }

    private fun initListeners() {
        initButtonPositiveListener()
        initButtonNegativeListener()
    }

    private fun configureDialogTitle() {
        binding.tvTitle.text = title ?: getString(com.allaber.localization.R.string.text_confirmation)
    }

    private fun configureDialogDescription() {
        if (description.isNullOrBlank()) {
            binding.tvDescription.gone()
        } else {
            binding.tvDescription.text = description
            binding.tvDescription.show()
        }
    }

    private fun configureButtonPositiveText() {
        binding.buttonPositive.text = buttonPositiveText ?: getString(com.allaber.localization.R.string.text_confirm)
    }

    private fun configureButtonNegativeText() {
        binding.buttonNegative.text = buttonNegativeText ?: getString(com.allaber.localization.R.string.text_cancel)
    }

    private fun initButtonPositiveListener() {
        binding.buttonPositive.setOnClickListener {
            buttonPositiveCallback.invoke()
            dismiss()
        }
    }

    private fun initButtonNegativeListener() {
        binding.buttonNegative.setOnClickListener {
            buttonNegativeCallback.invoke()
            dismiss()
        }
    }

    companion object {
        fun createInstance(
            title: String? = null,
            description: String? = null,
            buttonPositiveText: String? = null,
            buttonNegativeText: String? = null,
            buttonPositiveCallback: () -> Unit,
            buttonNegativeCallback: () -> Unit
        ): ConfirmationDialog {
            return ConfirmationDialog().apply {
                this.title = title
                this.description = description
                this.buttonPositiveText = buttonPositiveText
                this.buttonNegativeText = buttonNegativeText
                this.buttonPositiveCallback = buttonPositiveCallback
                this.buttonNegativeCallback = buttonNegativeCallback
            }
        }
    }
}