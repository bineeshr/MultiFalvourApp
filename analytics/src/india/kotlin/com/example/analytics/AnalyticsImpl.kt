package com.example.analytics

import android.os.Bundle
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class AnalyticsImpl : Analytics {
    override fun logEvent(event: AnalyticsEvent) {
        val firebaseAnalytics = Firebase.analytics
        val bundle = Bundle()
        for (entry in event.parameters) {
            val key = entry.key.lowercase()
            bundle.putString(key, entry.value.toString())
        }
        firebaseAnalytics.logEvent(event.eventName, bundle)
    }
}