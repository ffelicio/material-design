package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_single_line_text_field.*

class SingleLineTextFieldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_line_text_field)

        callIntentMultilineTextField()
    }

    private fun callIntentMultilineTextField() {
        button_call_intent_multiline_text_field.setOnClickListener {
            val nome = editTextNome?.text.toString()

            Log.d("TESTE", "Enviando o '${nome}' para a activity MultiLineTextFieldActivity")

            val intent = Intent(this, MultiLineTextFieldActivity::class.java)

            // Setando o valor da variável para enviar para a activity
            intent.putExtra("nome", nome)

            startActivity(intent)
        }
    }
}
