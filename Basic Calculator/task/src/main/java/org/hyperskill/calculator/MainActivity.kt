package org.hyperskill.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var input: Double
        val edit = findViewById<EditText>(R.id.editText)
        val btnClear = findViewById<Button>(R.id.clearButton)
        val btnDot = findViewById<Button>(R.id.dotButton)

        val numbers = arrayOf<Button>(
            findViewById(R.id.button0),
            findViewById(R.id.button1),
            findViewById(R.id.button2),
            findViewById(R.id.button3),
            findViewById(R.id.button4),
            findViewById(R.id.button5),
            findViewById(R.id.button6),
            findViewById(R.id.button7),
            findViewById(R.id.button8),
            findViewById(R.id.button9),
            btnDot
        )
        numbers.forEachIndexed { i, v ->
            v.setOnClickListener {
                when {
                    i == 0 && edit.text.toString() == "0" -> {
                    }
                    i == 10 && edit.text.toString().contains(".") -> {
                    }
                    i == 10 -> edit.setText("${edit.text}.")
                    else -> edit.setText("${edit.text}$i")
                }
            }
        }

        btnClear.setOnClickListener {
            edit.setText("")
        }

    }
}
