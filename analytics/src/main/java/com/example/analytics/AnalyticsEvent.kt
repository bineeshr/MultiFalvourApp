package com.example.analytics

import java.util.*

class AnalyticsEvent(val eventName: String) {

    val parameters = mutableMapOf<String, Any>()

    fun put(paramName: String, value: String) {
        parameters[paramName.lowercase(Locale.getDefault())] = value.lowercase(Locale.getDefault())
    }
}