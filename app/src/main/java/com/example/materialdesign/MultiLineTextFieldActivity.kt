package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multi_line_text_field.*

class MultiLineTextFieldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_line_text_field)

        setDadosView()
    }

    private fun setDadosView() {
        val nome = getIntent().getStringExtra("nome")

        // Setando a informação na label
        txtlabelNomeUsuario.text = nome
    }
}