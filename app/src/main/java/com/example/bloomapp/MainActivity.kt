package com.example.bloomapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bloomapp.ui.theme.BloomAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BloomAppTheme {
        val navController= rememberNavController()

        NavHost(navController,"welcome"){
          composable("welcome"){
            WelcomeScreen(navController)
          }
          composable("login"){
            LoginScreen(navController)
          }
          composable("home"){
            HomeScreen()
          }


        }

      }
    }
  }
}

