@file:OptIn(ExperimentalMaterial3Api::class)

package com.mike.sokomart.ui.screens.items


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mike.sokomart.ui.theme.Purple80
import com.mike.sokomart.ui.theme.black

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
            }
        )
    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()
}