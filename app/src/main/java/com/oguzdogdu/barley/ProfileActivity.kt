package com.oguzdogdu.barley

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import com.oguzdogdu.barley.ui.theme.BarleyTheme

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarleyTheme {
                Text(text = "Hello World")
            }
        }
    }

}