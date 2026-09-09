package com.example.holamundo.components


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.holamundo.R

// COMPONENTE REUTILIZABLE Campo de texto personalizado  con los colores brindados
@Composable
fun CustomTextField(
    value: String,                          // String reutilizable en este momento vacio
    onValueChange: (String) -> Unit,        // funcion flecha qe cabmia el texto
    placeholderText: String,                // texto fantasma
    visualTransformation: VisualTransformation = VisualTransformation.None, // oculta caracteres si es contrasenia
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default // define el tipo de teclado del celular
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,

        // Texto fantasma con la Poppins Medium
        placeholder = {
            Text(
                text = placeholderText,
                fontFamily = FontFamily(Font(R.font.poppins_medium))
            )
        },

        // Ancho y alto
        modifier = Modifier
            .width(357.dp)
            .height(64.dp),

        // Esquinas redondeadas de 10dp segun el disenio
        shape = RoundedCornerShape(10.dp),

        // Configuracion de colores
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFF1F4FF),   // Fondo celeste cuando lo estas tocando
            unfocusedContainerColor = Color(0xFFF1F4FF), // Fondo celeste cuando no lo tocas
            focusedBorderColor = Color(0xFF1F41BB),      // Borde azul fuerte cuando esta activo
            unfocusedBorderColor = Color.Transparent,    // Sin borde visible cuando esta inactivo
        ),

        // Aplicamos las transformaciones de seguridad y teclado si se requieren
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions
    )
}