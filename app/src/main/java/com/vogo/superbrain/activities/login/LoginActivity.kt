package com.vogo.superbrain.activities.login

import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vogo.lib.activities.ParentLoginActivity
import com.vogo.superbrain.R
import com.vogo.superbrain.databinding.ActivityLoginBinding

/**
 * http://www.androidcodefinder.com/blog/2018/07/30/awesome-login-screen-design-using-constraint-layout-in-android-studio/
 */

class LoginActivity : ParentLoginActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.viewModel = viewModel

        viewModel.getLoginEvent().observe(this, Observer {
            Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_SHORT).show()
        })

    }


}