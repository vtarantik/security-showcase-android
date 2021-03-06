package cz.koto.misak.securityshowcase.ui.info

import android.content.Intent
import android.os.Bundle
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig
import cz.koto.misak.securityshowcase.R
import cz.koto.misak.securityshowcase.databinding.FragmentSettingsBinding
import cz.koto.misak.securityshowcase.ui.BaseFragment
import cz.koto.misak.securityshowcase.ui.settings.SettingViewModel


class SettingsFragment : BaseFragment<FragmentSettingsBinding, SettingViewModel>() {


    override fun getViewModelBindingConfig() =
            ViewModelBindingConfig(R.layout.fragment_settings, SettingViewModel::class.java)


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        fun newInstance() = SettingsFragment().apply {
            arguments = Bundle().apply {
                putBoolean(SettingViewModel.EXTRA_ENCRYPTION_REQUEST_SCHEDULED, false)
            }
        }

        fun newInstance(encryptionRequested: Boolean) = SettingsFragment().apply {
            arguments = Bundle().apply {
                putBoolean(SettingViewModel.EXTRA_ENCRYPTION_REQUEST_SCHEDULED, encryptionRequested)
            }
        }
    }
}