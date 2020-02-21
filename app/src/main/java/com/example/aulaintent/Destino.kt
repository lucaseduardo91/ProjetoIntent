package com.example.aulaintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destino.*
import kotlinx.android.synthetic.main.activity_main.*

class Destino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destino)
        var nomeRecebido = intent.getStringExtra("nome")
        var emailRecebido = intent.getStringExtra("email")
        var telefoneRecebido = intent.getStringExtra("telefone")

        telefonePass.text = telefoneRecebido
        emailPass.text = emailRecebido
        nomePass.text = nomeRecebido
    }
}
