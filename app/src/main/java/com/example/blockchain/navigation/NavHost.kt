package com.example.blockchain.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blockchain.screens.MainContent

@Composable
fun MovieNavigation() {
    val navController= rememberNavController()
    NavHost(navController = navController,
            startDestination = Screens.HomeScreen.name
        ){
        composable(Screens.HomeScreen.name){
            MainContent(navController = navController)
        }
        composable(Screens.InfoScreen.name){

        }
    }
}