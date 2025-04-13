package com.mike.sokomart.ui.screens.splash

import android.annotation.SuppressLint
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.R
import com.mike.sokomart.navigation.ROUT_DASHBOARD
import com.mike.sokomart.ui.theme.PurpleGrey40
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){


    //navigation
    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(3000)
        navController.navigate(ROUT_DASHBOARD)
    }
    //end navigation

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.iconhome),
            contentDescription = "Home",
            modifier = Modifier.fillMaxWidth().height(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Sokomart",
            fontSize = 40.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "Shopping at your convenience",
            fontSize = 30.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )


    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}