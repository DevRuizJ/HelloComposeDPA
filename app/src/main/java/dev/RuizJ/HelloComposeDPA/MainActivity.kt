package dev.RuizJ.HelloComposeDPA

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.RuizJ.HelloComposeDPA.ui.theme.HelloComposeDPATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /**HelloComposeDPATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }**/
            /**Text("HOLA JAVIER")**/
            HelloComposeForm()
        }
    }
}

/**
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloComposeDPATheme {
        Greeting("Android")
    }
}
**/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelloComposeForm(){
    var name by remember{ mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar({Text("Holis wey")})
        }
    ) {
        padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement
                .spacedBy(16.dp)
        ) {
            Text("Otra vez we bienvenido")
            OutlinedTextField(
                value = name,
                onValueChange = {name = it},
                label = {Text("tu nombre we")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            OutlinedTextField(
                value = birthDate,
                onValueChange = {birthDate = it},
                label = {Text("cuando naciste we")}
            )
            Button(
                onClick = {},
                enabled = name.isNotEmpty() && birthDate.isNotEmpty()
            ) {
                Text("Envíalo we")
            }
        }
    }
}