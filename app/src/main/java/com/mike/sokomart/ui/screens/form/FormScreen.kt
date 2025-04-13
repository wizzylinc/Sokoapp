package com.mike.sokomart.ui.screens.form

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mike.sokomart.R
import com.mike.sokomart.ui.theme.Purple80
import com.mike.sokomart.ui.theme.Purple80

@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "home",
            modifier = Modifier.size(250.dp),
        )
        Text(
            text = "Sign Up",
            fontSize = 50.sp,
            color = Purple80
        )
        Spacer(modifier = Modifier.height(10.dp))

        //variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "",
                    tint = Purple80,
                )
            },
            label = {
                Text(
                    text = "Full Name"
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple80,
                unfocusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                unfocusedLabelColor = Purple80,
                cursorColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of fullname
        //username
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "",
                    tint = Purple80,
                )
            },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple80,
                unfocusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                unfocusedLabelColor = Purple80,
                cursorColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of username
        //email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                    tint = Purple80,
                )
            },
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple80,
                unfocusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                unfocusedLabelColor = Purple80,
                cursorColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end of email
        //password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "",
                    tint = Purple80,
                )
            },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple80,
                unfocusedBorderColor = Purple80,
                focusedLabelColor = Purple80,
                unfocusedLabelColor = Purple80,
                cursorColor = Purple80
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
        //end of password
        Spacer(modifier = Modifier.height(10.dp))
        //buton start
        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Purple80),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Register")
        }
        //buton end
    }
}
@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}
