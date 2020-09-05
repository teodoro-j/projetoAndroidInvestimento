package com.example.calculadoradejuros

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

        val result = cap * (1 + tx * tempo)

        tv_result.text = result

    }
}