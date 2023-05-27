package com.gonzalez.blanchard.holamundojetpackfutbol.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun DetailScreen() {
    val coroutineScope = rememberCoroutineScope()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TituloTexto("Titulo del Madrid")

                val painter: Painter = rememberImagePainter(
                    data = "https://phantom-marca-mx.unidadeditorial.es/bee71d0f05447e84e4b27c11cbe6fa67/resize/828/f/jpg/mx/assets/multimedia/imagenes/2023/05/17/16843574430695.jpg",
                    builder = {
                        crossfade(true)
                    }
                )

                Image(
                    painter = painter,
                    contentDescription = "Imagen de prueba",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"
                )

                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = { /* TODO */ }) {
                    Text(text = "ACEPTAR")
                }
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDetailScreen(){
    DetailScreen()
}