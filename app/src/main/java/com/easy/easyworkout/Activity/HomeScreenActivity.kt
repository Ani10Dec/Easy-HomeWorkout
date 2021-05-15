package com.easy.easyworkout.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.easy.easyworkout.R

class HomeScreenActivity : AppCompatActivity() {
    lateinit var btnStart: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        btnStart = findViewById(R.id.btn_start)
        btnStart.setOnClickListener {
            val intent = Intent(this@HomeScreenActivity, WorkoutPlanActivity::class.java)
            startActivity(intent)
        }
    }
}