package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_multi_line_text_field.*

class MultiLineTextFieldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_line_text_field)

        setDadosView()
    }

    private fun setDadosView() {
        val intent = getIntent()
        val nome = intent.getStringExtra("nome")
//        val labelNomeUsuario = txtlabelNomeUsuario

        Toast.makeText(this@MultiLineTextFieldActivity, "Resgatando a referência '" + nome + "' passada na Activity SingleLineTextFieldActivity", Toast.LENGTH_SHORT).show()

        // Setando a informação na label
        // labelNomeUsuario.text = nome
    }
}
