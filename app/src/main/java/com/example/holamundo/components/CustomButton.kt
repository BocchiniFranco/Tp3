package com.example.holamundo.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.holamundo.R

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF1F41BB), // Azul principal por defecto
    textColor: Color = Color.White,
    width: Dp = 357.dp,
    height: Dp = 60.dp,
    elevation: Dp = 8.dp
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(width)
            .height(height),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = elevation,
            pressedElevation = elevation
        )
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
        )
    }
}