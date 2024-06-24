package com.example.activity1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity1.ui.theme.ACTIVITY1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ACTIVITY1Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
    ){
        Image(
            painter = painterResource(id = R.drawable.fda),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(0.3f)
                .padding(),


            )
        Text(
            text = "The Dynamic Landscape of Medicine: A Holistic Overview",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 16.dp)
                .fillMaxWidth(),
            fontSize = 20.sp
        )
        Text(
            text = "Medicine, as a field, is an intricate tapestry woven from the threads of scientific inquiry, compassionate care, and societal need. It encompasses diverse disciplines, each contributing uniquely to the overarching goal of promoting health and alleviating suffering. From the frontlines of clinical practice to the corridors of research laboratories, medicine manifests as a dynamic and evolving force, continually adapting to meet the challenges of an ever-changing landscape. Through their expertise and empathy, clinicians navigate the complexities of human health, striving to improve outcomes and enhance quality of life for those under their care.",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 25.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ACTIVITY1Theme {
        Greeting()
    }
}