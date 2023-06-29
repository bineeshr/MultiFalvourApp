package com.example.multiflavourapp

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp

class MultiFlavorApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}