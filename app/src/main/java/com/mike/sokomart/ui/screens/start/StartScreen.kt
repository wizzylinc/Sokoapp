package com.mike.sokomart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.R
import com.mike.sokomart.navigation.ROUT_ITEM
import com.mike.sokomart.ui.theme.black

@Composable
fun StartScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Text(text = "Welcome")

        Image(
            painter = painterResource(R.drawable.start),
            contentDescription = "start",
            contentScale = ContentScale.Crop,


        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find Your Order!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = black

            )
        Text(
            text = "Online shopping, or e-commerce, allows you to purchase goods and services from sellers over the internet by browsing, selecting products, and adding them to a virtual cart, then paying at checkout.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
            )
        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "Get started")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    StartScreen(rememberNavController())
}