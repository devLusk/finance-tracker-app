package com.example.financetracker.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BoxesArea() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Investment Boxes (3)",
                style = MaterialTheme.typography.titleLarge
            )

            Button(
                onClick = {/*TODO*/ },
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Box",
                    modifier = Modifier.size(20.dp)
                )
            }
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