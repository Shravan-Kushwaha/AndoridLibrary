package com.example.andoridlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shravanalert.ShravanAlert

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShravanAlert.alert(this, "Hello World!!!")
    }
}
