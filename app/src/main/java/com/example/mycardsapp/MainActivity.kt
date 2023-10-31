package com.example.mycardsapp

import android.graphics.Paint.Align
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycardsapp.ui.theme.MyCardsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCardsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Cards App", fontWeight = FontWeight.Bold,modifier=Modifier .padding(top = 10.dp)


        )
    }

    Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
    Column(modifier = Modifier
        .padding(top = 50.dp)
        .fillMaxSize()
        .background(Color.White), ) {
        // First Row of Cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // First Card

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Green)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_in_talk_24), contentDescription = "phone")

                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardOne", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))

                    }
                }


                // Add your content for card 2 here
            }
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Yellow)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_backup_24), contentDescription = "phone")
                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardTwo", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))

                    }
                }


                // Add your content for card 2 here
            }

        }

        // Second Row of Cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // First Card
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Green)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_in_talk_24), contentDescription = "phone")

                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardThree", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))

                    }
                }


                // Add your content for card 2 here
            }

            // Second Card
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Yellow)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_in_talk_24), contentDescription = "phone")

                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardFour", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))

                    }
                }


                // Add your content for card 2 here
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // First Card
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Yellow)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_in_talk_24), contentDescription = "phone")

                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardFive", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))
                    }
                }


                // Add your content for card 2 here
            }
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .weight(1f) // Equal width distribution
                    .padding(5.dp),colors = CardDefaults.cardColors(Color.Green)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly){
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_in_talk_24), contentDescription = "phone")

                    }
                    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
                        Text(text = "CardSix", modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth().background(Color.White), textAlign = TextAlign.Center)

                        Divider()
                        Text(text = "New phone",modifier = Modifier.padding(top=3.dp))

                    }
                }


                // Add your content for card 2 here
            }

                // Add your content for card 2 here
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCardsAppTheme {
        HomeScreen("Android")
    }

}

