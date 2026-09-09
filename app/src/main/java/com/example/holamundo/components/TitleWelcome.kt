package com.example.holamundo.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.holamundo.R

@Composable
fun TitleWelcome(){
    Text(
        text = "Discover Your\nDream Job here",
        color = Color(0xFF1F41BB),
        fontSize = 35.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
        lineHeight = 35.sp,
        textAlign = TextAlign.Center
    )
}
