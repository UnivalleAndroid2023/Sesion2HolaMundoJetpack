package com.gonzalez.blanchard.holamundojetpackfutbol.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TituloTexto(valor: String){
    Text(text = valor,
        style = TextStyle(
            fontSize = 30.sp,
            letterSpacing = 0.15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        ),
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTituloTexto(){
    TituloTexto("Esto es un titulo")
}