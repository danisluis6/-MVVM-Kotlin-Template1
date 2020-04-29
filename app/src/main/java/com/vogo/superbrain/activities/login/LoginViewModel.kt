package com.vogo.superbrain.activities.login

import android.app.Application
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.vogo.lib.livedatautils.EventLive
import com.vogo.lib.views.SplashView
import com.vogo.superbrain.R
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginViewModel : ViewModel(), KoinComponent, SplashView {


    val app: Application by inject()

    val titleLoginButton = ObservableField<String>()

    val enableLoginButton = ObservableBoolean(false)
    val shouldShowLoginButton = ObservableBoolean(false)

    val loginEvent = EventLive<String>()

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
        titleLoginButton.set(app.getString(R.string.global_label_login))
        enableLoginButton.set(false)
        shouldShowLoginButton.set(false)
    }

    fun getLoginEvent(): LiveData<String> = loginEvent

    fun onLoginButtonClick() {
        loginEvent.trigger()
    }

}
