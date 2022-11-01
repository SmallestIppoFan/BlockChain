package com.example.blockchain.navigation

enum class Screens {
    HomeScreen,
    InfoScreen;
    companion object{
        fun fromRoute(route:String?):Screens=
            when(route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                InfoScreen.name -> InfoScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("No such page")
            }
        }
    }