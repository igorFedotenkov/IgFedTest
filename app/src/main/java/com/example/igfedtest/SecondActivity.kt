package com.example.igfedtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        AppCenter.start(
            application, "b111d934-a352-42cd-ab9f-5b39c3e6530d",
            Analytics::class.java, Crashes::class.java
        )
    }
}