package com.oguzdogdu.barley

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.oguzdogdu.barley.ui.theme.BarleyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarleyTheme {
                MyApp()
            }
        }
    }
}


@Composable
fun MyApp() {


}