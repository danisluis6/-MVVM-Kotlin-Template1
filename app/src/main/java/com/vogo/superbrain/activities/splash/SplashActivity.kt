package com.vogo.superbrain.activities.splash

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.vogo.lib.views.activities.ParentSplashActivity
import com.vogo.lib.views.listener.SplashView
import com.vogo.superbrain.R
import com.vogo.superbrain.databinding.ActivitySplashBinding

class SplashActivity : ParentSplashActivity(), SplashView {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }

    override fun showDialogProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideDialogProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
