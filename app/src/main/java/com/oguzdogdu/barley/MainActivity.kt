package com.oguzdogdu.barley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.oguzdogdu.barley.data.Puppy
import com.oguzdogdu.barley.ui.theme.BarleyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarleyTheme {
                MyApp {
                    startActivity(Intent(this,ProfileActivity::class.java))
                }
            }
        }
    }
}


@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(content = {
        BarleyHomeContent(navigateToProfile = navigateToProfile)
    })
}