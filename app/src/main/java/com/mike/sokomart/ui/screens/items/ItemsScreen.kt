@file:OptIn(ExperimentalMaterial3Api::class)

package com.mike.sokomart.ui.screens.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mike.sokomart.R
import com.mike.sokomart.ui.theme.Purple80
import com.mike.sokomart.ui.theme.black
import java.nio.file.WatchEvent

@Composable
fun ItemScreen(){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Item") },
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

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }


            }
        )
        //End of TopAppBar



        //Start of image fillwidth

        Image(
            painter = painterResource(R.drawable.brand),
            contentDescription = "Home",
            modifier = Modifier.fillMaxWidth().height(200.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))
        //end of image fillwidth

        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {  Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = {Text(text = "Search")}
        )

        //end of searchbar
        Spacer(modifier = Modifier.height(10.dp))


        //Row
        Row (modifier = Modifier.padding(start = 20.dp)){
            Image(
                painter = painterResource(R.drawable.shirt),
                contentDescription = "Home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth

            )

            Column {
                Text(
                    text = "Men shirts",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                    )
                Text(
                    text = "Casual wear",
                    fontSize = 15.sp
                )
                Text(
                    text = "Ksh.1900",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Ksh.1500",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                }


            }


        }
        //End of Row

        Row (modifier = Modifier.padding(start = 20.dp)){
            Image(
                painter = painterResource(R.drawable.shirt),
                contentDescription = "Home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth

            )

            Column {
                Text(
                    text = "Men shirts",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Text(
                    text = "Casual wear",
                    fontSize = 15.sp
                )
                Text(
                    text = "Ksh.1900",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Ksh.1500",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                }


            }

        }
        //End of Row


        Row (modifier = Modifier.padding(start = 20.dp)){
            Image(
                painter = painterResource(R.drawable.shirt),
                contentDescription = "Home",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth

            )

            Column {
                Text(
                    text = "Men shirts",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Text(
                    text = "Casual wear",
                    fontSize = 15.sp
                )
                Text(
                    text = "Ksh.1900",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Ksh.1500",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Purple80)
                }


            }


        }


    }
    //End of Row


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()
}