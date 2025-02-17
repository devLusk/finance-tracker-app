package com.example.financetracker.mainsScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financetracker.features.composables.InvestmentCard
import com.example.financetracker.features.composables.NavigationButtons
import com.example.financetracker.features.composables.NewCardArea
import com.example.financetracker.features.composables.TotalBalanceCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(top = 72.dp, start = 16.dp, end = 16.dp)
    ) {
        TotalBalanceCard()

        Spacer(modifier = Modifier.height(16.dp))

        NewCardArea()

        Spacer(modifier = Modifier.height(16.dp))

        InvestmentCard()

        Spacer(modifier = Modifier.weight(1f))

        NavigationButtons()

        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
