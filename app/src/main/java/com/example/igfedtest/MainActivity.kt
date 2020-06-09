package com.example.igfedtest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "b111d934-a352-42cd-ab9f-5b39c3e6530d",
            Analytics::class.java, Crashes::class.java
        )
    }

    fun onclick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}