package com.example.calculadoradejuros

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente:View) {
        val cap = et_capital.text
        val tx = et_taxa.text
        val tempo = et_tempo.text
        val user = et_user.text

        /*
        val result = cap * (1 + tx * tempo)
         */

        if(result < 1500){
            tv_result.setTextColor(Color.parseColor("#209E89"))
            tv_result.text =
        } else if (result > 3000){
            tv_result.setTextColor(Color.parseColor("#03DAC5"))
            tv_result.text =
        } else {
            tv_result.setTextColor(Color.parseColor("#5EEBD3"))
            tv_result.text =
        }


    }
}