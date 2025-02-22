package com.github.devlusk.financetracker.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.devlusk.financetracker.composable.CardItem
import com.github.devlusk.financetracker.composable.InvestmentCard
import com.github.devlusk.financetracker.composable.NavigationButtons
import com.github.devlusk.financetracker.composable.NewCardArea
import com.github.devlusk.financetracker.composable.TotalBalanceCard
import com.github.devlusk.financetracker.ui.theme.FinanceTrackerTheme

@Composable
fun HomeScreen() {
    Scaffold { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
                .padding(top = 20.dp)
        ) {
            TotalBalanceCard()

            Spacer(modifier = Modifier.height(16.dp))

            NewCardArea()

            Spacer(modifier = Modifier.height(16.dp))

            InvestmentCard(
                CardItem(
                    title = "Motorcycle Reservation",
                    date = "16 Feb 24",
                    value = 123f
                )
            )

            Spacer(modifier = Modifier.weight(1f))

            NavigationButtons()

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    FinanceTrackerTheme {
        HomeScreen()
    }
}
