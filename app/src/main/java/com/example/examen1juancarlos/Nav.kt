@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.examen1juancarlos

import androidx.compose.runtime.Composable
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.examen1juancarlos.ui.inicio
import com.example.examen1juancarlos.ui.sumador
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun Nav(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable(route = "inicio")
        {
            inicio()
        }
        composable(
            route = "suma/{num1}/{num2}",
            arguments = listOf(
                navArgument("num1") {
                    type = NavType.StringType
                    defaultValue = "0"
                    nullable = false
                },
                navArgument("num2") {
                    type = NavType.StringType
                    defaultValue = "0"
                    nullable = false
                }
            )
        )
        { entrada ->
            sumador(
                num1 = entrada.arguments?.getString("num1"),
                num2 = entrada.arguments?.getString("num2")
            )
        }
    }
}

