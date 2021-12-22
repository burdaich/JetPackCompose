package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellocompose.ui.theme.HelloComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          HelloCompose()
        }
    }
}

@Composable
fun HelloCompose(){
    Column {
        Image(painterResource(id = R.drawable.platzi), contentDescription = null)
        Text("Este curso es lo mejor")
        Text("Hello Compose")
        Button(onClick = {  }) {
            Text(text = "Click me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloComposePreview(){
    HelloCompose()
}