package com.chirag.tracking.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.chirag.tracking.R
import com.chirag.tracking.db.RunDAO
import com.chirag.tracking.network.NewsAPI
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    @Inject
    lateinit var newsAPI: NewsAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("newsAPI", "newsAPI${newsAPI.hashCode()}")
    }
}