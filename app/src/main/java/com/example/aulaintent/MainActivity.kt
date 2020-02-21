package com.example.aulaintent

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confirmar.setOnClickListener{
            mostraMensagemDados()
            val activityDest = Intent(this, Destino::class.java)
            activityDest.putExtra("nome",nome.text.toString())
            activityDest.putExtra("email",email.text.toString())
            activityDest.putExtra("telefone",telefone.text.toString())
            startActivity(activityDest)
        }
    }

    fun mostraMensagemDados(){
        var mensagem = "Olá, " + nome.text +"\n Email:"+ email.text + "\n Telefone:" + telefone.text
        Toast.makeText(getApplicationContext(),mensagem,Toast.LENGTH_LONG).show()
    }
}
