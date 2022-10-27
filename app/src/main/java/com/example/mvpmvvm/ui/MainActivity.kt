package com.example.mvpmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),LoginContract.View {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun setSuccess() {
        TODO("Not yet implemented")
    }

    override fun setError() {
        TODO("Not yet implemented")
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

}