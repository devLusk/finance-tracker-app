package com.github.devlusk.financetracker.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.github.devlusk.financetracker.ui.theme.FinanceTrackerTheme

@Composable
fun NewCardArea() {
    Column() {
        Row(
            verticalAlignment = Alignment.Companion.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.Companion.fillMaxWidth()
        ) {
            Text(
                text = "Investment Boxes (3)",
                style = MaterialTheme.typography.titleLarge
            )

            Button(
                onClick = { /*TODO*/ },
                contentPadding = androidx.compose.foundation.layout.PaddingValues(0.dp),
                modifier = Modifier.Companion.size(35.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Box",
                    modifier = Modifier.Companion.size(20.dp)
                )
            }

        }
    }
}

@Preview
@Composable
fun OverviewScreenPreview() {
    FinanceTrackerTheme {
        NewCardArea()
    }
}