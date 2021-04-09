package com.jota.superhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnAvanzar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnAvanzar = findViewById(R.id.btnAvanzar)


        btnAvanzar.setOnClickListener {
            //lblResultado.text = btnAccion.text.toString().toInt().toString()
            val activity2 = Intent (this, MainActivity2 :: class.java)
            startActivity (activity2)
        }
    }
}