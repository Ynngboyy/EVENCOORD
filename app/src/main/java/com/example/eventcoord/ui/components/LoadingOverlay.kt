package com.example.eventcoord.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun LoadingOverlay(
    isLoading: Boolean,
    message: String = "Cargando..." // Mensaje por defecto
) {
    if (isLoading) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.6f)) // Fondo oscuro al 60%
                .zIndex(10f), // Esto asegura que flote por las pantallas
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator( // El círculo giratorio
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(50.dp),
                    strokeWidth = 4.dp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = message,
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}