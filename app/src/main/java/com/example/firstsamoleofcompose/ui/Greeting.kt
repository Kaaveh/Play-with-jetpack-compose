package com.example.firstsamoleofcompose.ui

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.firstsamoleofcompose.darkTheme


@Composable
fun Greeting() {
    val context = LocalContext.current
    val name = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = name.value,
            onValueChange = {
                name.value = it
            })
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                Toast.makeText(context, "Hi ${name.value}!", Toast.LENGTH_SHORT).show()
            }) {
            Text(text = "Click me!")
        }
        Spacer(modifier = Modifier.height(200.dp))
        Button(
            onClick = {
                darkTheme.value = !darkTheme.value
            }) {
            Text(text = "Change theme")
        }
    }
}