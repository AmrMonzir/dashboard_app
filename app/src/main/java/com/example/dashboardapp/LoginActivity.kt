package com.example.dashboardapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.serialization.Serializable

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContent {
//            Login()
//        }
    }

    @Serializable
    object LoginScreen

    @Composable
    public fun Login(navController: NavController) {
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
                .background(color = Color(android.graphics.Color.parseColor("#f8eeec")))
        ) {
            Image(painter = painterResource(id = R.drawable.top_background1), contentDescription = null)
            Text(
                text = "Welcome\nBack",
                color = Color(android.graphics.Color.parseColor("#Ea6d36")),
                modifier = Modifier.padding(start = 24.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold
            )

            var text by rememberSaveable {
                mutableStateOf("")
            }
            TextField(
                value = text,
                onValueChange = { text = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = null,
                        modifier = Modifier
                            .size(4.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                label = { Text(text = "Email") },
                shape = RoundedCornerShape(10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color.White,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                    unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(Color.White, CircleShape)

            )


            var text2 by rememberSaveable {
                mutableStateOf("")
            }

            TextField(
                value = text2,
                onValueChange = { text2 = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = null,
                        modifier = Modifier
                            .size(4.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                label = { Text(text = "Password") },
                shape = RoundedCornerShape(10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color.White,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                    unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(Color.White, CircleShape)

            )


            Image(painter = painterResource(id = R.drawable.btn_arraw1),
                contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .padding(top = 24.dp, end = 24.dp)
                    .align(Alignment.End)
                    .clickable { })

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
            ) {
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                        .weight(0.5f)
                        .height(55.dp),
                    border = BorderStroke(
                        1.dp, Color(android.graphics.Color.parseColor("#4d4d4d"))
                    ),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f), verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.google),
                            contentDescription = null,
                            modifier = Modifier
                                .width(25.dp)
                                .clickable { })
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Google",
                            color = Color(android.graphics.Color.parseColor("#2f4f86")),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp, end = 8.dp)
                        .weight(0.5f)
                        .height(55.dp),
                    border = BorderStroke(
                        1.dp, Color(android.graphics.Color.parseColor("#4d4d4d"))
                    ),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f), verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.facebook),
                            contentDescription = null,
                            modifier = Modifier
                                .width(25.dp)
                                .clickable { })
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Facebook",
                            color = Color(android.graphics.Color.parseColor("#2f4f86")),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Text(
                text = "Are you a new user? Register here",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 50.dp)
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(SignUpActivity.SignUpScreen)
                    },
                textAlign = TextAlign.Center,
                color = Color(android.graphics.Color.parseColor("#3b608c"))
            )


        }
    }
}