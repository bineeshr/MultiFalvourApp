package com.example.analytics

import android.os.Bundle
import java.util.*

interface Analytics {
    fun logEvent(event: AnalyticsEvent)
}

