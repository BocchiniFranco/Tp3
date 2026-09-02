package com.example.holamundo.screens

import androidx.compose.runtime.Composable
//convierte el kotlin en un componente visual
import androidx.compose.foundation.layout.Column
//importa el disenio columna
import androidx.compose.ui.Modifier
//motor de estilizacion de compose cambia formas y comportamientos de los componentes
import androidx.compose.foundation.layout.fillMaxSize
//indica qe el disenio debe cubrir la totalidad de la pantalla
import androidx.compose.ui.unit.dp
//unidad de medida para tamanios y margenes
import androidx.compose.ui.Alignment
//alinia o centra los elementos
import com.example.holamundo.R
//IMPORTANTE: La letra R significa "Resources" (Recursos), es el indice que conecta el codigo con la carpeta res
import androidx.compose.foundation.layout.padding
//se encarga de generar los espacios en blanco, basicamente establece los margenes
import androidx.compose.foundation.layout.width
//modificador de ancho
import androidx.compose.foundation.layout.height
//modificador de altura
import androidx.compose.foundation.shape.RoundedCornerShape
//al pasarle los dp te marca qe tan redondeada queres las esquinas

//************************TEXTO Y DISENIO*************************
import androidx.compose.foundation.layout.Spacer
//espaciador bloque transparente
import androidx.compose.material3.Text
//componente visual que escribe texto en la pantalla
import androidx.compose.ui.graphics.Color
//importa la paleta de colores para cambiar el color a textos, fondos, etc
import androidx.compose.ui.text.font.FontWeight
//grosor de la letra (Bold, SemiBold, Regular, etc)
import androidx.compose.ui.text.style.TextAlign
//centra el texto en su propia caja
import androidx.compose.ui.unit.sp
//tamanio de letra. Se usa sp porque si el usuario agranda la letra en su celular, esto se adapta
import androidx.compose.ui.text.font.Font
//va a buscar a res/font el archivo ttf
import androidx.compose.ui.text.font.FontFamily
//compose requiere que envuelvas tu fuente en una familia sin importar si usas una sola

//*****************INPUTS Y ESTADOS*****************
import androidx.compose.material3.OutlinedTextField
//componente oficial de material design para crear campos de texto con un borde interactivo
import androidx.compose.material3.OutlinedTextFieldDefaults
//permite cambiar las propiedades visuales del campo de texto
import androidx.compose.runtime.getValue
//permite leer el valor guardado en una variable de estado
import androidx.compose.runtime.setValue
//permite modificar el valor guardado en una variable de estado
import androidx.compose.runtime.mutableStateOf
//crea una variable reactiva
import androidx.compose.runtime.remember
//le dice a la pantalla que "recuerde" lo que el usuario escribio

//***************** CONTRASENIA Y TECLADOS *****************
import androidx.compose.ui.text.input.PasswordVisualTransformation
//oculta los caracteres de la contrasenia cambiandolos por puntitos
import androidx.compose.ui.text.input.KeyboardType
//permite cambiar el tipo de teclado del celular
import androidx.compose.foundation.text.KeyboardOptions
//trabaja en equipo con KeyboardType para aplicar esa configuracion al teclado

//***************** BOTONES Y FILAS *****************
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size

@Composable
fun RegisterScreen() {

    // ESTADOS
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") } // Estado extra para confirmar contrasenia

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(97.dp))

        Column(
            modifier = Modifier.width(357.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Create Account",
                color = Color(0xFF1F41BB),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Create an account so you can explore all the existing jobs",
                color = Color.Black,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                textAlign = TextAlign.Center,
                lineHeight = 22.sp
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        // INPUT EMAIL
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email", fontFamily = FontFamily(Font(R.font.poppins_medium))) },
            modifier = Modifier
                .width(357.dp)
                .height(64.dp),
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF1F4FF), // Fondo cuando lo estas tocando
                unfocusedContainerColor = Color(0xFFF1F4FF), // Fondo cuando no lo tocas
                focusedBorderColor = Color(0xFF1F41BB), // Borde azul activo
                unfocusedBorderColor = Color.Transparent, // Sin borde cuando esta inactivo
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        // INPUT PASSWORD
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password", fontFamily = FontFamily(Font(R.font.poppins_medium))) },
            modifier = Modifier
                .width(357.dp)
                .height(64.dp),
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF1F4FF),
                unfocusedContainerColor = Color(0xFFF1F4FF),
                focusedBorderColor = Color(0xFF1F41BB),
                unfocusedBorderColor = Color.Transparent,
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // INPUT CONFIRM PASSWORD
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = { Text("Confirm Password", fontFamily = FontFamily(Font(R.font.poppins_medium))) },
            modifier = Modifier
                .width(357.dp)
                .height(64.dp),
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF1F4FF),
                unfocusedContainerColor = Color(0xFFF1F4FF),
                focusedBorderColor = Color(0xFF1F41BB),
                unfocusedBorderColor = Color.Transparent,
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(40.dp))

        // BOTON PRINCIPAL SIGN UP
        Button(
            onClick = { /* logica de registro futuro */ },
            modifier = Modifier
                .width(357.dp)
                .height(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1F41BB)
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
        ) {
            Text(
                text = "Sign up",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // TEXTO: Already have an account
        Text(
            text = "Already have an account",
            color = Color.DarkGray,
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(60.dp))

        // TEXTO: Or continue with
        Text(
            text = "Or continue with",
            color = Color(0xFF1F41BB),
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        // FILA DE REDES SOCIALES
        Row(
            modifier = Modifier.width(200.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            // Icono Google
            Image(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = "Registro con Google",
                modifier = Modifier.size(60.dp)
            )

            // Icono Facebook
            Image(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = "Registro con Facebook",
                modifier = Modifier.size(60.dp)
            )

            // Icono Apple
            Image(
                painter = painterResource(id = R.drawable.ic_apple),
                contentDescription = "Registro con Apple",
                modifier = Modifier.size(60.dp)
            )
        }

    }
}
