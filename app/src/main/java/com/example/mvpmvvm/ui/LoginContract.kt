package com.example.mvpmvvm.ui

import android.view.View

class LoginContract {
    interface View {
        fun setSuccess()
        fun setError()
        fun showProgress()
        fun hideProgress()
    }

    interface Presenter {
        fun onAttach(view: android.view.View)
        fun onLogin()
        fun onCredentialsChanged()
    }
}