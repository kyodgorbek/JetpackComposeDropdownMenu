package com.example.jetpackcomposedropdownmenu

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.jetpackcomposedropdownmenu.ui.theme.JetpackComposeDropdownMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDropdownMenuTheme {

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(
                        listOf(
                            "Philipp",
                            "Carl",
                            "Martin",
                            "Jake",
                            "Jake",
                            "Jake",
                            "Jake",
                            "Jake",
                            "Philipp",
                            "Philipp",
                        )
                    ) {
                        PersonItem(
                            personName = it,
                            dropDownItems = listOf(
                                DropDownItem("Item 1"),
                                DropDownItem("Item 2"),
                                DropDownItem("Item 3"),
                            ),
                            onItemClick = {
                                Toast.makeText(
                                    applicationContext,
                                    it.text,
                                    Toast.LENGTH_LONG
                                ).show()
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}