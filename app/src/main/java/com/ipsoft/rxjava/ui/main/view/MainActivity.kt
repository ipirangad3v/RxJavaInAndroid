package com.ipsoft.rxjava.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ipsoft.rxjava.R
import com.ipsoft.rxjava.ui.main.adapter.MainAdapter
import com.ipsoft.rxjava.ui.main.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var mainViewModel: MainViewModel
    private lateinit var adapter: MainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


}