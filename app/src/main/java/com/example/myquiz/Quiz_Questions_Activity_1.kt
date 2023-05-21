package com.example.myquiz

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.Toast

class Quiz_Questions_Activity_1 : AppCompatActivity() {

    private var userName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

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


        userName = intent.getStringExtra(Constants.USER_NAME)
        Toast.makeText(this, "Hallo $userName", Toast.LENGTH_LONG).show()

        val questionList = Constants.getQuestions()
        Log.i("Fragen", "${questionList.size}")

    }
}