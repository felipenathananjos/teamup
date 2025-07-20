package com.github.felipenathananjos.teamup.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.MonetizationOn
import androidx.compose.material.icons.outlined.WatchLater
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.felipenathananjos.teamup.R

@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp)
    ) {
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(R.drawable.ic_account_circle), contentDescription = "foto usuário")
        }
        Text("Jogos", style = MaterialTheme.typography.titleMedium)
        Spacer(Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Ide fut", style = MaterialTheme.typography.titleSmall)
                    Row {
                        Icon(imageVector = Icons.Outlined.WatchLater, contentDescription = "horário", Modifier.size(16.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("19:30", style = MaterialTheme.typography.bodySmall)
                    }
                }
                Spacer(Modifier.height(8.dp))
                Text("Terça-Feira", style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(10.dp))
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row {
                        Text("Organizador: ", style = MaterialTheme.typography.bodySmall)
                        Text("Beltrano de Tal", style = MaterialTheme.typography.bodySmall)
                    }
                    Column {
                        Row {
                            Icon(
                                imageVector = Icons.Outlined.Check,
                                contentDescription = "confirmado",
                                tint = Color.Green,
                                modifier = Modifier.size(16.dp)
                            )
                            Text("Confirmado", style = MaterialTheme.typography.labelMedium)
                        }
                        Row {
                            Icon(
                                imageVector = Icons.Outlined.MonetizationOn,
                                contentDescription = "pago",
                                tint = Color.Green,
                                modifier = Modifier.size(16.dp)
                            )
                            Text("Pago", style = MaterialTheme.typography.labelMedium)
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun HomeScreenContentPreview() {
    HomeScreenContent()
}