package com.github.devlusk.financetracker.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
fun TotalBalanceCard() {
    Column(
        modifier = Modifier
            .shadow(4.dp, RoundedCornerShape(10.dp))
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(horizontal = 16.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Total Balance",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "+195,40" + " (+1,2%)",
                color = Color.Green,
                modifier = Modifier
                    .background(Color.Gray.copy(alpha = .1f), RoundedCornerShape(10.dp))
                    .padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "$19,540.00",
            style = MaterialTheme.typography.displayMedium
        )
    }
}

@Preview
@Composable
fun TotalBalanceCardPreview() {
    FinanceTrackerTheme {
        TotalBalanceCard()
    }
}