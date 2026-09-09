package com.example.holamundo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.holamundo.R

@Composable
fun SocialMediaRow() {
    Row(
        modifier = Modifier.width(200.dp), // Ancho fijo de la fila
        horizontalArrangement = Arrangement.SpaceEvenly // Distribuye los íconos de forma pareja
    ) {
        // Ícono Google
        Image(
            painter = painterResource(id = R.drawable.ic_google),
            contentDescription = "Acceso con Google",
            modifier = Modifier.size(60.dp)
        )

        // Ícono Facebook
        Image(
            painter = painterResource(id = R.drawable.ic_facebook),
            contentDescription = "Acceso con Facebook",
            modifier = Modifier.size(60.dp)
        )

        // Ícono Apple
        Image(
            painter = painterResource(id = R.drawable.ic_apple),
            contentDescription = "Acceso con Apple",
            modifier = Modifier.size(60.dp)
        )
    }
}