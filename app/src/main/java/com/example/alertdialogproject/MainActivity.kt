package com.example.alertdialogproject

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenDialog = findViewById<Button>(R.id.btnOpenDialog)
        btnOpenDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Çıkmak istiyor musunuz?")
            builder.setMessage("Uygulamadan çıkmak istiyor musunuz?")
            builder.setPositiveButton("Evet") { dialog, _ ->
                finish()
            }
            builder.setNegativeButton("Hayır") { dialog, _ ->
                dialog.dismiss()
            }
            builder.show()
        }
    }
}
