package com.github.devlusk.financetracker.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.devlusk.financetracker.ui.theme.FinanceTrackerTheme

@Composable
fun InvestmentCard(item: CardItem) {
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
                text = item.title,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "Started at ${item.date}",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "$${"%,.2f".format(item.value)}",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.weight(1.5f)
            )

            GoalProgressBar(modifier = Modifier.weight(1f), percentage = .9f)
        }
    }
}

data class CardItem(
    val title: String,
    val date: String,
    val value: Float
)

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InvestmentCardPreview() {
    FinanceTrackerTheme {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxHeight()
        ) {
            InvestmentCard(
                CardItem(
                    title = "Motorcycle Reservation",
                    date = "12 Jan 24",
                    value = 14850f
                )
            )
        }
    }
}