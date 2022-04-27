package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//Vek Histories

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{compareValls()}

    }
    private fun compareValls()
    {
        val edit1: EditText = findViewById(R.id.edtNumber1)
        val edit2: EditText = findViewById(R.id.edtNumber2)


        if(edit1.length() != 0)
        {

            if(Integer.parseInt(edit1.text.toString()) > Integer.parseInt(edit2.text.toString()))
            {
                Toast.makeText(this, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT).show()
            }
            else
            {
                if(Integer.parseInt(edit1.text.toString()) < Integer.parseInt(edit2.text.toString()))
                {
                    Toast.makeText(this, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
                }
            }

        }else
        {
            Toast.makeText(this, "Insert a valid number", Toast.LENGTH_SHORT).show()
        }
    }



}