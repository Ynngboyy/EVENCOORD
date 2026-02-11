package com.example.eventcoord.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eventcoord.ui.screens.home.HomeScreen
import com.example.eventcoord.ui.screens.login.LoginScreen
import com.example.eventcoord.ui.screens.login.PasswordScreen
import com.example.eventcoord.ui.screens.login.RegistrationScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    // Definimos las rutas
    NavHost(navController = navController, startDestination = "login") {
        // Ruta 1: Login
        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("home") },
                onForgotPassword = { navController.navigate("password") },
                onRegister = { navController.navigate("register") }
            )
        }
        // Ruta 2: Home
        composable("home") {
            HomeScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
        // Ruta 3: Password
        composable("password") {
            PasswordScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
        // Ruta 4: Registration
        composable("register"){
            RegistrationScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}