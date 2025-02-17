package com.example.financetracker.mainsScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.financetracker.features.composables.InvestmentCard
import com.example.financetracker.features.composables.NavigationButtons
import com.example.financetracker.features.composables.NewCardArea
import com.example.financetracker.features.composables.TotalBalanceCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column {
        TotalBalanceCard()
        NewCardArea()
        InvestmentCard()
        NavigationButtons()
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}