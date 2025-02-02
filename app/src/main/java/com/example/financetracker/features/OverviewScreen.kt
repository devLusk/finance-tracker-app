package com.example.financetracker.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BalanceArea() {
    Row(
        modifier = Modifier
            .shadow(4.dp, RoundedCornerShape(10.dp))
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(horizontal = 16.dp, vertical = 20.dp)
    ) {

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Total Balance",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "19,540.00",
                style = MaterialTheme.typography.displayMedium
            )
        }

        Text(
            text = "+195,40" + " (+1,2%)",
            color = Color.Green,
            modifier = Modifier
                .background(Color.Transparent, RoundedCornerShape(10.dp))
                .padding(8.dp)
        )
    }
}

@Composable
fun BoxesArea() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Investment Boxes (3)",
                style = MaterialTheme.typography.titleLarge
            )

            // TODO: Arrastar o botao para direita
            Button(
                onClick = {/*TODO*/ },
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            ) { }
        }

        // TODO: Adicionar as caixinhas
    }
}


// Tela
@Composable
fun OverviewScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 72.dp)
    ) {
        BalanceArea()
        Spacer(modifier = Modifier.height(20.dp))
        BoxesArea()
    }
}

// Preview da Tela
@Preview(showSystemUi = true)
@Composable
fun OverviewScreenPreview() {
    OverviewScreen()
}