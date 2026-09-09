package com.example.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.holamundo.ui.theme.HolaMundoTheme

// --- IMPORTS DE NAVEGACIÓN ---
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// --- IMPORTS DE PANTALLAS Y RUTAS ---
import com.example.holamundo.navigation.Screen
import com.example.holamundo.screens.LoginScreen
import com.example.holamundo.screens.RegisterScreen
import com.example.holamundo.screens.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Permite que la app ocupe toda la pantalla incluyendo barras del sistema

        setContent {
            HolaMundoTheme {
                // Instanciamos el controlador que recuerda el historial de pantallas
                val nav = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { inner ->

                    // Reemplazamos el Box por el NavHost.
                    // Le pasamos el innerPadding para que no pise la barra del reloj/batería
                    NavHost(
                        navController = nav,
                        startDestination = Screen.Welcome.route,
                        modifier = Modifier.padding( paddingValues = inner)
                    ) {

                        // PANTALLA 1: WELCOME
                        composable(Screen.Welcome.route) {
                            WelcomeScreen(
                                onLogin = { nav.navigate(Screen.Login.route) },
                                onRegister = { nav.navigate(Screen.Register.route) }
                            )
                        }

                        // PANTALLA 2: LOGIN
                        composable(Screen.Login.route) {
                            LoginScreen(
                                onForgot = { /* TODO: Lógica de recuperar contraseña */ },
                                onSignIn = {
                                    nav.navigate(Screen.Welcome.route) {
                                        // Limpia el historial para que no pueda volver atrás al login
                                        popUpTo(Screen.Welcome.route) { inclusive = true }
                                        launchSingleTop = true
                                    }
                                },
                                onRegister = { nav.navigate(Screen.Register.route) }
                            )
                        }

                        // PANTALLA 3: REGISTER
                        composable(Screen.Register.route) {
                            RegisterScreen(
                                onSignUp = {
                                    nav.navigate(Screen.Welcome.route) {
                                        // Limpia el historial tras registrarse
                                        popUpTo(Screen.Welcome.route) { inclusive = true }
                                        launchSingleTop = true
                                    }
                                },
                                onLogin = { nav.navigate(Screen.Login.route) }
                            )
                        }

                    }
                }
            }
        }
    }
}