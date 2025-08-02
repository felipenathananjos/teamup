package com.github.felipenathananjos.teamup.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.MonetizationOn
import androidx.compose.material.icons.outlined.WatchLater
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
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
        Spacer(Modifier.height(12.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Jogos", style = MaterialTheme.typography.titleMedium)
            IconButton(onClick = {}, modifier = Modifier.size(24.dp)) {
                Icon(imageVector = Icons.Outlined.Add, contentDescription = "adicionar")
            }
        }
        Spacer(Modifier.height(16.dp))
        GameCard()
        Spacer(Modifier.height(4.dp))
        Text("ver mais", style = MaterialTheme.typography.labelMedium.copy(textDecoration = TextDecoration.Underline))
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = {}, contentPadding = PaddingValues(0.dp)) {
            Text("Histórico", style = MaterialTheme.typography.titleMedium.copy(textDecoration = TextDecoration.Underline))
        }
    }
}

@Composable
private fun GameCard() {
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
                            tint = colorResource(R.color.green_4),
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            "Confirmado",
                            style = MaterialTheme.typography.labelMedium.copy(color = colorResource(R.color.green_4))
                        )
                    }
                    Row {
                        Icon(
                            imageVector = Icons.Outlined.MonetizationOn,
                            contentDescription = "pago",
                            tint = colorResource(R.color.green_4),
                            modifier = Modifier.size(16.dp)
                        )
                        Text("Pago", style = MaterialTheme.typography.labelMedium.copy(color = colorResource(R.color.green_4)))
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