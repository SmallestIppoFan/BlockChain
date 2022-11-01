package com.example.blockchain.screens

import CreateBlockChain
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainContent(navController: NavController) {
    var chain=CreateBlockChain()
    val chainText= remember {
        mutableStateOf("")
    }
    androidx.compose.material.Surface(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "Write your text here",
                style = MaterialTheme.typography.h4
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(value = chainText.value, onValueChange ={
                chainText.value=it
            },
            label = {
                Text(text = "Enter your text")
            },
                singleLine = true,
                keyboardActions = KeyboardActions.Default
                )
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = {
                chain.createBlock(chainText.value)
            }) {
                Text(text = "Send")
            }
        }
    }
}

@Preview
@Composable
fun Prev() {
    MainContent(navController = rememberNavController())
}