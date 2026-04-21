package com.example.grokisawsome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = Color.Red.toArgb()      // লাল রঙ (scrim হিসেবে)
            )
        )
        super.onCreate(savedInstanceState)

        setContent {
//            GrokIsAwsomeTheme {
//
//                Honor600ProDesignScreen()
//
//            }

Demo()
        }
    }
}

