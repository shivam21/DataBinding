package com.bhusridevelopers.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.bhusridevelopers.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
