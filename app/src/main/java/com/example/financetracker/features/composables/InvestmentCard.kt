package com.example.financetracker.features.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InvestmentCard() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .shadow(4.dp, RoundedCornerShape(10.dp))
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(horizontal = 16.dp, vertical = 20.dp)
            .height(100.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Motorcycle Reservation",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "Started at 12 Jan 24",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "$14,850.00",
                style = MaterialTheme.typography.headlineMedium
            )

            Column {
                Text(
                    text = "Goal $20,000.00",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.Gray
                )
                Button(
                    onClick = {},
                ) { }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InvestmentCardPreview() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(Color.Red)
            .fillMaxHeight()
    ) {
        InvestmentCard()
    }
}