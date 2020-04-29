package com.vogo.superbrain.activities.splash

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.vogo.lib.views.SplashView
import com.vogo.superbrain.SBApplication
import org.koin.core.KoinComponent
import org.koin.core.inject

class SplashViewModel : ViewModel(), KoinComponent, SplashView {


    val app: SBApplication by inject()

    val sloganTitle = ObservableField<String>()

    companion object {
        const val DELAY_TIME = 1000
    }

    init {
        initViews()
        initAttributes()
    }

    override fun initViews() {

    }

    override fun initAttributes() {
        sloganTitle.set("Now")
    }

}
