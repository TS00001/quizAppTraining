package com.example.myquiz

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Statusleiste ausblenden
        // TODO: Funktion um statusleiste auszublenden schreiben
        if (Build.VERSION.SDK_INT < 30){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }else{
            window.setDecorFitsSystemWindows(false)
            val controller = window.insetsController
            if (controller != null){
                controller.hide(WindowInsets.Type.statusBars())
                controller.systemBarsBehavior =
                    WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }

        val btnStart = findViewById<Button>(R.id.btnStart)
        var etName = findViewById<TextView>(R.id.etName)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this, "Bitte gib deinen Namen ein", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, Quiz_Questions_Activity_1::class.java)
                intent.putExtra(Constants.USER_NAME , etName.text.toString())
                startActivity(intent)
                finish()
            }
        }

        fun hideStatusbar(){

        }


    }

}
