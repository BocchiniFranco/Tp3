package com.example.holamundo.screens

import androidx.compose.runtime.Composable
//convierte el kotlin en un componente visual
import androidx.compose.foundation.layout.Column
//importa el disenio columna
import androidx.compose.ui.Modifier
//motor de estilizacion de compose cambia formas y comportamientos  de los componentes
import androidx.compose.foundation.layout.fillMaxSize
//indica qe el disenio debe cubrir la totalidad de la pantalla
import androidx.compose.ui.res.painterResource
//basicamente convierte el png en algo qe compose pueda enternder
import androidx.compose.foundation.Image
//trae el componente visual capaz de dibujar una imagen en la pantalla
import androidx.compose.ui.unit.dp
//agranda o achica la imagen segun la pantalla
//import androidx.compose.foundation.layout.size
//función para el Modifier que  permite establecer el ancho y alto exacto de la imagen
import androidx.compose.ui.Alignment
//alinia o centra los elementos
import com.example.holamundo.R
//IMPORTANTE
// La letra R significa "Resources" (Recursos) preguntar si es lo mismo hacer un import de res
// es un indice
import androidx.compose.foundation.layout.padding
//se encarga de generar los espacios en blanco basicamente esblece los margenes
import androidx.compose.foundation.layout.width
//modificador de ancho
import androidx.compose.foundation.layout.height
//modificador de altura
import androidx.compose.foundation.shape.RoundedCornerShape
//al pasarle los dp te marca qe tan redondeada queres las esquinas
import androidx.compose.ui.draw.clip
//basicamente recorta todos los bordes aplicando el rounded
//************************TEXTO*************************
import androidx.compose.foundation.layout.Spacer
//espaciador bloque transparente
import androidx.compose.material3.Text
//
import androidx.compose.ui.graphics.Color
//tamanio de letra usa dp por que si pones la letra grande se puede agrandar
import androidx.compose.ui.text.font.FontWeight
//grosor de la letra
import androidx.compose.ui.text.style.TextAlign
//centra el texto en su propia caja
import androidx.compose.ui.unit.sp
//importa la paleta de colores
import androidx.compose.ui.text.font.Font
//va a buscar a res.font el archivo ttf
import androidx.compose.ui.text.font.FontFamily
//compose requiere que envuelvas tu fuente en una familia sin importar si usas una sola
//*************************BOTONES***************************
import androidx.compose.foundation.layout.Row
//como el colum pero horizontal
import androidx.compose.foundation.layout.Arrangement
//trabaja con el row dividiendo el espacio entre los elementos para quq elas cosas qeden centradas y separadas
import androidx.compose.foundation.layout.fillMaxWidth
//indica qe la fila tiene ocuarpar el 100 del ancho de la pantalla
import androidx.compose.material3.Button
//componenten de compose para botones interactivos
import androidx.compose.material3.ButtonDefaults
//permite cambiar  las propiedades del boton como fondo sombra o elevacion


//vista completa
@Composable
fun WelcomeScreen() {
    // Contenedor principal
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //agregarmos la imagen dentro
        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            //trae la imagen de res
            contentDescription = "Ilustración de un hombre trabajando en su notebook",
            //esto sirve por si la persona es ciega le lee la descripcion de qe es la imagen
            //si no tiene importancia se le puede poner null
            modifier = Modifier
                // margen exterior
                .padding(top = 16.dp, start = 22.dp)

                // tamaño que dice el figma
                .width(385.dp)
                .height(422.dp)

                // redondes de las esquinas
                .clip(RoundedCornerShape(20.dp))

                //margen interior
                .padding(top = 32.dp, bottom = 32.dp, start = 11.dp, end = 11.dp)
        )
        // espaciador para separar la imagen de los textos
        Spacer(modifier = Modifier.height(35.dp))

        // caja contenedora para los textos (ancho exacto de Figma: 343px)
        Column(
            modifier = Modifier.width(343.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // TITULO
            Text(
                text = "Discover Your\nDream Job here",
                color = Color(0xFF1F41BB),
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                lineHeight = 35.sp,
                textAlign = TextAlign.Center
            )

            // ESPACIADOR
            Spacer(modifier = Modifier.height(16.dp))

            //SUB
            Text(
                text = "Explore all the existing job roles based on your interest and study major",
                color = Color.Black,
                fontSize = 12.sp,//aca hice trampa por qe no me qedaba igual
                lineHeight = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                textAlign = TextAlign.Center
            )

        } //FINAL TEXTO
        Spacer(modifier = Modifier.height(100.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth() //ocupar el 100
                .padding(horizontal = 20.dp), //espacio con el borde
            horizontalArrangement = Arrangement.SpaceEvenly // distribucion del espacio
        ) {

            // Boton de LOGIN
            Button(
                onClick = { /* algun dia va a loggear */ },
                modifier = Modifier
                    .width(160.dp) // ancho fijo de figma (160px)
                    .height(60.dp), // altura fija de figma (60px)
                shape = RoundedCornerShape(10.dp), // esquinas redondeadas (10px de figma)
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1F41BB) // Color azul 1F41BB
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp) // Sombra sombreada del diseño
            ) {
                Text(
                    text = "Login",
                    color = Color.White, // texto blanco
                    fontSize = 20.sp, // tamanio figma
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)), // popins semi
                    lineHeight = 20.sp //altura de la linea
                )
            }

            // BOTON DE REGISTER
            Button(
                onClick = { /*  */ },
                modifier = Modifier
                    .width(160.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp) //sin sombra qeda plano
            ) {
                Text(
                    text = "Register",
                    color = Color(0xFF1F41BB), //texto azul
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                    lineHeight = 20.sp
                )
            }

        }
    }
    }
