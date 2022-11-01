package com.example.blockchain.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun InfoPage(navController: NavController) {
    androidx.compose.material.Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            LazyColumn{
                //items()
            }
        }
    }

}

@Composable
fun item(message:String,previousHash:String,newHash:String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp),
        shape = RoundedCornerShape(0.dp),
    ) {
        Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.Start,
            ) {
            Text(text = "Message:",
                style = MaterialTheme.typography.h6)
            Text(text = "Previous hash:",
                style = MaterialTheme.typography.h6)
            Text(text = "New hash:",
                style = MaterialTheme.typography.h6)

        }
    }
}