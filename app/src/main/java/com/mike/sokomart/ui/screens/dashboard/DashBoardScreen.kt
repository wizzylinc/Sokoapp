package com.mike.sokomart.ui.screens.dashboard

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.R
import com.mike.sokomart.navigation.ROUT_ABOUT
import com.mike.sokomart.navigation.ROUT_INTENT
import com.mike.sokomart.navigation.ROUT_START
import com.mike.sokomart.ui.theme.Purple80


@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
    ){
        //card start
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
            colors = CardDefaults.cardColors(Purple80)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(R.drawable.iconhome),
                    contentDescription = "home",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                )
                Text(
                    text = "Sokomart",
                    fontSize = 48.sp,


                    )

            }
        }
        //end of card
        Row (
            modifier = Modifier.padding(20.dp)
        ){
            Spacer(modifier = Modifier.width(20.dp))
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_START
                )},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ){
                    Image(
                        painter = painterResource(R.drawable.iconhome),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                    )
                    Text(
                        text = "Home"
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_INTENT
                )},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ){
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                    )
                    Text(
                        text = "Products"
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        Row (
            modifier = Modifier.padding(20.dp)
        ){
            Spacer(modifier = Modifier.width(20.dp))
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_START
                )},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ){
                    Image(
                        painter = painterResource(R.drawable.service),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                    )
                    Text(
                        text = "Contacts"
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_ABOUT
                )},
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                    )
                    Text(
                        text = "About"
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashboardScreen(navController= rememberNavController())
}
