package com.cleanarch.trial

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.cleanarch.trial.ui.theme.BrownLight
import com.cleanarch.trial.ui.theme.White
import com.cleanarch.trial.ui.theme.WhitePurple

@Composable
fun Login(){
    Canvas(modifier = Modifier.fillMaxSize()) {

        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFFECDF1),
                    Color(0xFFFECDF1).copy(alpha = 0.4f),
                    Color.Transparent
                ),
                radius = 450f,
                center = Offset(80f, 700f)
            ),
            radius = 450f,
            center = Offset(80f, 700f)
        )

        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFFECDF1),
                    Color(0xFFFECDF1).copy(alpha = 0.4f),
                    Color.Transparent
                ),
                radius = 300f,
                center = Offset(1000f, 300f)
            ),
            radius = 300f,
            center = Offset(1000f, 300f)
        )

        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFB7AFD5),
                    Color(0xFFB7AFD5).copy(alpha = 0.4f),
                    Color.Transparent
                ),
                radius = 300f,
                center = Offset(1000f, 1300f)
            ),
            radius = 300f,
            center = Offset(1000f, 1300f)
        )

        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFB7AFD5),
                    Color(0xFFB7AFD5).copy(alpha = 0.4f),
                    Color.Transparent
                ),
                radius = 450f,
                center = Offset(80f, 1700f)
            ),
            radius = 450f,
            center = Offset(80f, 1700f)
        )
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Login()
    Column(
        modifier = Modifier
            .fillMaxSize().background(Color.Transparent)
            .padding(50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.logo), contentDescription = "",
            modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(40.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth().shadow(10.dp),
            shape = (RoundedCornerShape(10.dp))
        ) {
            OutlinedTextField(
                value = name,
                onValueChange = {name = it},
                placeholder = { Text("E-mail",  color = BrownLight) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(White).border(2.dp, BrownLight, RoundedCornerShape(10.dp)),
                textStyle = TextStyle(fontSize = 22.sp, color = BrownLight),
                singleLine = true
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth().shadow(10.dp),
            shape = (RoundedCornerShape(10.dp))
        ) {
            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                placeholder = { Text("Password", color = BrownLight) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(White).border(2.dp, BrownLight, RoundedCornerShape(10.dp)),
                textStyle = TextStyle(fontSize = 22.sp, color = BrownLight),
                singleLine = true
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth().clip(RoundedCornerShape(0.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = WhitePurple,
                contentColor = BrownLight,

            )
        ) {
            Text(
                text = "Login",
                style = TextStyle(fontSize = 25.sp)
            )

        }


        Text(
            text = "________________________________",
            color = BrownLight,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(40.dp))

        LinearProgressIndicator(
            modifier = Modifier
                .width(200.dp)
                .align(Alignment.CenterHorizontally)
        )

    }

}