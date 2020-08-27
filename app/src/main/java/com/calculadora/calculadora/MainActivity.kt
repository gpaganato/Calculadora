package com.calculadora.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        numero_zero.setOnClickListener { AcrescentarExpressao("0", true) }
        numero_um.setOnClickListener { AcrescentarExpressao("1", true) }
        numero_dois.setOnClickListener { AcrescentarExpressao("2", true) }
        numero_tres.setOnClickListener { AcrescentarExpressao("3", true) }
        numero_quatro.setOnClickListener { AcrescentarExpressao("4", true) }
        numero_cinco.setOnClickListener { AcrescentarExpressao("5", true) }
        numero_seis.setOnClickListener { AcrescentarExpressao("6", true) }
        numero_sete.setOnClickListener { AcrescentarExpressao("7", true) }
        numero_oito.setOnClickListener { AcrescentarExpressao("8", true) }
        numero_nove.setOnClickListener { AcrescentarExpressao("9", true) }
        ponto.setOnClickListener { AcrescentarExpressao(".", true) }

        //Operadores
        adicao.setOnClickListener { AcrescentarExpressao("+", false) }
        subtracao.setOnClickListener { AcrescentarExpressao("-", false) }
        multiplicacao.setOnClickListener { AcrescentarExpressao("*", false) }
        divisao.setOnClickListener { AcrescentarExpressao("/", false) }

        limpar.setOnClickListener {
            txt_resultado.text = ""
            expressao.text = ""
        }

        backspace.setOnClickListener {
            val string = expressao.text.toString()

            if (string.isNotBlank()){
                expressao.text = string.substring(0,string.length-1)
            }
            txt_resultado.text = ""
        }

        igual.setOnClickListener {
            try {
                val expressao = ExpressionBuilder(expressao.text.toString()).build()

                val resultado = expressao.evaluate()
                val longResult = resultado.toLong()

                if (resultado == longResult.toDouble())
                    txt_resultado.text = longResult.toString()
                else
                    txt_resultado.text = resultado.toString()
            }catch (e: Exception){

            }
        }
    }

    fun AcrescentarExpressao(string: String,limpar_dados: Boolean){

        if (txt_resultado.text.isNotEmpty()){
            expressao.text = ""
        }

        if (limpar_dados){
            txt_resultado.text = ""
            expressao.append(string)
        }else{
            expressao.append(txt_resultado.text)
            expressao.append(string)
            txt_resultado.text = ""
        }
    }
}