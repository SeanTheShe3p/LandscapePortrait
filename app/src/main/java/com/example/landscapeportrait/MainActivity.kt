package com.example.landscapeportrait

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            var text = findViewById<EditText>(R.id.editText).text.toString()
            if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(this, "Portrait " + text, Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Landscape " + text, Toast.LENGTH_SHORT).show()
            }
        }

    }
}