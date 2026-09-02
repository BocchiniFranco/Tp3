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
//unidad de medida para tamaños y márgenes (Density-independent Pixels)
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

//************************TEXTO Y DISEÑO*************************
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
//tamaño de letra. Se usa sp porque si el usuario agranda la letra en su celular, esto se adapta
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
//le dice a la pantalla que "recuerde" lo que el usuario escribió

//***************** CONTRASEÑA Y TECLADOS *****************
import androidx.compose.ui.text.input.PasswordVisualTransformation
//oculta los caracteres de la contraseña cambiandolos por puntitos
import androidx.compose.ui.text.input.KeyboardType
//permite cambiar el tipo de teclado del celular
import androidx.compose.foundation.text.KeyboardOptions
//trabaja en equipo con KeyboardType para aplicar esa configuración al teclado

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
fun LoginScreen() {

    // ESTADOS
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(97.dp))

        // CABECERA
        Column(
            modifier = Modifier.width(225.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login here",
                color = Color(0xFF1F41BB),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Welcome back you've been missed!",

                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                textAlign = TextAlign.Center,
                lineHeight = 30.sp
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
                focusedBorderColor = Color(0xFF1F41BB),
                unfocusedBorderColor = Color.LightGray,
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

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
                focusedBorderColor = Color(0xFF1F41BB),
                unfocusedBorderColor = Color.LightGray,
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // FORGOT PASSWORD TEXT
        Text(
            text = "Forgot your password?",
            color = Color(0xFF1F41BB),
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            modifier = Modifier.width(357.dp),
            textAlign = TextAlign.End
        )

        Spacer(modifier = Modifier.height(30.dp))

        // BOTÓN PRINCIPAL SIGN IN
        Button(
            onClick = { /* algun dia la logica de sesion */ },
            modifier = Modifier
                .width(357.dp) // Mismo ancho que los inputs para alinear perfecto
                .height(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1F41BB)
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
        ) {
            Text(
                text = "Sign in",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // TEXTO: Create new account
        Text(
            text = "Create new account",
            color = Color.DarkGray, // Gris oscuro como en Figma
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(60.dp))

        // TEXTO: Or continue with
        Text(
            text = "Or continue with",
            color = Color(0xFF1F41BB), // Azul
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        // FILA DE REDES SOCIALES
        Row(
            modifier = Modifier.width(200.dp), // Ancho de la caja
            horizontalArrangement = Arrangement.SpaceEvenly // genera espacios parejos
        ) {

            // Icono Google
            Image(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = "Login con Google",
                modifier = Modifier.size(60.dp) // tamanio ajustado segun preferencia
            )

            // Icono Facebook
            Image(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = "Login con Facebook",
                modifier = Modifier.size(60.dp)
            )

            // Icono Apple
            Image(
                painter = painterResource(id = R.drawable.ic_apple),
                contentDescription = "Login con Apple",
                modifier = Modifier.size(60.dp)
            )
        }

    }
}
