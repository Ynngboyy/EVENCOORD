package com.example.eventcoord

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.eventcoord.ui.AppNavigation
import com.example.eventcoord.ui.theme.EventCoordTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventCoordTheme {
                // Llamamos al gestor de navegacion
                AppNavigation()
            }
        }
    }
}