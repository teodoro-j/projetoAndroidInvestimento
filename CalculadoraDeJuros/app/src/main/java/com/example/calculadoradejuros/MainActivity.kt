package com.example.calculadoradejuros

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente:View) {
        val user = et_user.text
        val cap = et_capital.text.toString().toDouble()
        val tx = et_taxa.text.toString().toDouble()
        val tempo = et_tempo.text.toString().toInt()

        if(user.length < 3){
            Toast.makeText(this, "Não existe nome com de 2 ou menos Letras", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Nome Validade!!", Toast.LENGTH_LONG).show()
        }

        if(cap > 0 && tx < 0 ) {
            Toast.makeText(this, "Valor inválido", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Preencha o p´roximo campo", Toast.LENGTH_LONG).show()
        }

        if (tempo < 1 ) {
            Toast.makeText(this, "Precisa ter pelo menos 1 mês", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Prencha o próximo campo", Toast.LENGTH_SHORT).show()
        }

        val result = realizarCalculo(cap, tx, tempo)

        if(result < 1500){
            tv_result.setTextColor(Color.parseColor("#D1C93B"))
            tv_result.text = "Sr(a) $user, o seu investimento esta baix!!"
        } else if (result > 3000){
            tv_result.setTextColor(Color.parseColor("#9E9A5C"))
            tv_result.text = "Sr(a) $user, o seu investimento está acima do esperado!"
        } else {
            tv_result.setTextColor(Color.parseColor("#6B6249"))
            tv_result.text = "Sr(a) $user, o seu investimneto está começando a ser produtivo!"
        }
    }

    fun realizarCalculo(cap:Double, tx:Double, tempo:Int):Double{
        return cap * (1 + tx * tempo)
    }
}