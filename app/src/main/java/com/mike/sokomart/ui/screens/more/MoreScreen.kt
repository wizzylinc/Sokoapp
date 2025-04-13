package com.mike.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.R
import com.mike.sokomart.navigation.ROUT_INTENT
import com.mike.sokomart.ui.theme.Purple80
import com.mike.sokomart.ui.theme.black

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
                title = { Text(text = "More Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Purple80,
                titleContentColor = black,
                navigationIconContentColor = black
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(10.dp))

        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {  Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = {Text(text = "Search more products.......")}
        )

        //end of searchbar
        Spacer(modifier = Modifier.height(10.dp))

        //Box
        Box(
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(R.drawable.brand),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                modifier = Modifier.align(alignment = Alignment.TopEnd)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        Text(
                text = "Popular types of cars",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,

                )
        Spacer(modifier = Modifier.height(20.dp))
        //row start
        Row (
            modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())
        ){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
        }
        //row end
        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Purple80),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Purchase Here")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Reviews",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )
        //Text(
        //    text = "This mid-size, two-row luxury crossover is unnaturally light on its feet, with chassis tuning derived from over two decades of performance-SUV supremacy.\n" +
        //          "US86,695.00 · 4.8 · Review by Drew Dorian\n" +
        //        "\u200ETested: 2024 Porsche... · \u200E2025 Porsche Cayenne Hybrid · \u200EView Photos · \u200E2024",
        //fontSize = 18.dp,
        // )

    }

}
@Preview(showBackground = true)
@Composable
fun MoreScreenPreview(){
    MoreScreen(rememberNavController())
}