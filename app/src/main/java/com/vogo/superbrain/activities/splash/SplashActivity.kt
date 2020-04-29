package com.vogo.superbrain.activities.splash

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vogo.lib.activities.ParentSplashActivity
import com.vogo.superbrain.R
import com.vogo.superbrain.activities.login.LoginActivity
import com.vogo.superbrain.databinding.ActivitySplashBinding

class SplashActivity : ParentSplashActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)

        binding.viewModel = viewModel

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}
