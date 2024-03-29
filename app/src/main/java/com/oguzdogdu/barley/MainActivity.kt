package com.oguzdogdu.barley

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.oguzdogdu.barley.data.Puppy
import com.oguzdogdu.barley.ui.theme.BarleyTheme
import com.oguzdogdu.barley.view.main.BarleyHomeContent
import com.oguzdogdu.barley.view.profile.ProfileActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarleyTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
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