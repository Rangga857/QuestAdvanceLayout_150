package com.example.myapplication

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import  androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnRow(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection()
        DetailMhs(
            x = "Nama",
            y = "Jordan Scally Prison"
        )
        DetailMhs(
            x = "NIM",
            y = "20220140340"
        )
        DetailMhs(
            x = "Prodi",
            y = "Teknologi Informasi"
        )
        DetailMhs(
            x = "Fakultas",
            y = "Teknik"
        )
        DetailMhs(
            x = "Universitas",
            y = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            x = "Alamat",
            y = "Jl.Diponegoro, Jakarta Selatan"
        )
        DetailMhs(
            x = "Email",
            y = "jordanscally@gmail.com"
        )

    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
        ){
           Box(contentAlignment = Alignment.BottomEnd){
               Image(
                   painter = painterResource(id = R.drawable.image),
                   contentDescription = null,
                   modifier = Modifier.clip(CircleShape))
               Icon(
                   Icons.Filled.Check,
                   contentDescription = null,
                   modifier = Modifier.size(38.dp).background(Color.Blue)
               )
           }
            Column (modifier = Modifier.padding(16.dp)){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammdaiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(x : String, y :String){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(text = x,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = y,
                modifier = Modifier.weight(2f))
        }
    }
}