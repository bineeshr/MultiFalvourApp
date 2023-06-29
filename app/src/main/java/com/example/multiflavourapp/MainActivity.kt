package com.example.multiflavourapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.analytics.AnalyticsEvent
import com.example.analytics.AnalyticsImpl
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testEvent = AnalyticsEvent("Test Event").apply {
            put("TestEvent", "Test")
            put("TestEvent", "Test")
        }
        AnalyticsImpl().logEvent(testEvent)
    }
}