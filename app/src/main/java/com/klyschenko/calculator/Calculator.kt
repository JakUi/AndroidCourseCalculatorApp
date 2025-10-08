package com.klyschenko.calculator

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


var expression = mutableStateOf("45x8") // это изменяемый объект State на который можно подписаться
var result = mutableStateOf("360")

@Composable
fun Calculator(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column(
            // окно ввода и вывода результатов
            modifier = modifier.fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    )
                )
                .background(color = MaterialTheme.colorScheme.primaryContainer)
                .weight(1f)
                .padding(bottom = 16.dp, end = 40.dp, start = 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = expression.value,
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Text(
                text = result.value,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "√",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                modifier = Modifier.weight(1f),
                text = "π",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                modifier = Modifier.weight(1f),
                text = "^",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                modifier = Modifier.weight(1f),
                text = "!",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .clickable {
                        Log.d("Calculator", "The 'AC' button is clicked")
                        expression.value = ""
                        result.value = ""
                    }
                    .background(MaterialTheme.colorScheme.secondary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AC",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "( )",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "%",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "÷",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "7",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "8",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "9",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "X",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "4",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "5",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "6",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "-",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "1",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "2",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "3",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "+",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.weight(2f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(2f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "0",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier.weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = ",",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "=",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

        }
    }
}

//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//    ) {
//        val operations = listOf("AC", "( )", "%", "÷")
//        for (operation in operations) {
//            val color = if (operation == "AC") {
//                MaterialTheme.colorScheme.secondary
//            } else {
//                MaterialTheme.colorScheme.tertiary
//            }
//            Box(
//                modifier = Modifier
//                    .background(color = color)
//                    .fillMaxWidth()
//                    .weight(1f)
//                    .aspectRatio(1f),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = operation,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.SemiBold,
//                    color = Black,
//                    textAlign = TextAlign.Center
//                )
//
//            }
//        }
//    }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//    ) {
//        val operations = listOf("7", "8", "9", "X")
//        for (operation in operations) {
//            val color = if (operation == "X") {
//                MaterialTheme.colorScheme.tertiary
//            } else {
//                MaterialTheme.colorScheme.primary
//            }
//            Box(
//                modifier = Modifier
//                    .background(color = color)
//                    .fillMaxWidth()
//                    .weight(1f)
//                    .aspectRatio(1f),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = operation,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.SemiBold,
//                    color = Black,
//                    textAlign = TextAlign.Center
//                )
//
//            }
//        }
//    }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//    ) {
//        val operations = listOf("4", "5", "6", "-")
//        for (operation in operations) {
//            val color = if (operation == "-") {
//                MaterialTheme.colorScheme.tertiary
//            } else {
//                MaterialTheme.colorScheme.primary
//            }
//            Box(
//                modifier = Modifier
//                    .background(color = color)
//                    .fillMaxWidth()
//                    .weight(1f)
//                    .aspectRatio(1f),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = operation,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.SemiBold,
//                    color = Black,
//                    textAlign = TextAlign.Center
//                )
//
//            }
//        }
//    }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//    ) {
//        val operations = listOf("1", "2", "3", "+")
//        for (operation in operations) {
//            val color = if (operation == "+") {
//                MaterialTheme.colorScheme.tertiary
//            } else {
//                MaterialTheme.colorScheme.primary
//            }
//            Box(
//                modifier = Modifier
//                    .background(color = color)
//                    .fillMaxWidth()
//                    .weight(1f)
//                    .aspectRatio(1f),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = operation,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.SemiBold,
//                    color = Black,
//                    textAlign = TextAlign.Center
//                )
//
//            }
//        }
//    }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//    ) {
//        val operations = listOf("0", ",", "=")
//        for (operation in operations) {
//            val color = if (operation == "=") {
//                MaterialTheme.colorScheme.tertiary
//            } else {
//                MaterialTheme.colorScheme.primary
//            }
//            val weight = if (operation == "0") {
//                2f
//            } else {
//                1f
//            }
//            Box(
//                modifier = Modifier
//                    .background(color = color)
//                    .fillMaxWidth()
//                    .weight(weight)
//                    .aspectRatio(weight),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = operation,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.SemiBold,
//                    color = Black,
//                    textAlign = TextAlign.Center
//                )
//
//            }

//@Composable
//fun Test(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//            .fillMaxWidth(),
//        verticalArrangement = Arrangement.spacedBy(1.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        repeat(5) {
//            Column(
//                // окно ввода и вывода результатов
//                modifier = modifier
//                    .fillMaxWidth()
//                    .background(color = MaterialTheme.colorScheme.onBackground)
//                    .weight(1f),
//                verticalArrangement = Arrangement.Bottom,
//                horizontalAlignment = Alignment.End
//            ) {
//            }
//        }
//    }
//}