@file:OptIn(ExperimentalMaterial3Api::class)

package com.mike.sokomart.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.navigation.ROUT_ITEM
import com.mike.sokomart.ui.theme.Purple80
import com.mike.sokomart.ui.theme.black

@Composable
fun IntentScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current


        //TopAppBar
        TopAppBar(
            title = { Text(text = "Intents") },
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
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }


            }
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "MPESA")
        }
        Button(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0741669277".toUri()
                smsIntent.putExtra("sms_body","Hello Mike,how was your day?")
                mContext.startActivity(smsIntent)


            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "SMS")
        }
        Button(
            onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0741669277".toUri()
                mContext.startActivity(callIntent)

            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "CALL")
        }
        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "SHARE")
        }
        Button(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }

            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "CAMERA")
        }
        Button(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)

            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "EMAIL")
        }






    }





}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}