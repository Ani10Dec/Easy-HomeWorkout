package com.easy.easyworkout.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.easy.easyworkout.R

class WorkoutPlanActivity : AppCompatActivity() {

    lateinit var btnWeak: Button
    lateinit var btnUpper: Button
    lateinit var btnLower: Button
    lateinit var btnAbs: Button

    // Global Variables
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_plan)

        // HOOKS
        toolbar = findViewById(R.id.toolbar)
        btnWeak = findViewById(R.id.btn_start_weakly)
        btnUpper = findViewById(R.id.btn_upper_body)
        btnLower = findViewById(R.id.btn_start_lower)
        btnAbs = findViewById(R.id.btn_start_abs)

        // Setting toolbar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        btnWeak.setOnClickListener {
            startActivity(Intent(this, WeaklyActivity::class.java))
        }
        btnUpper.setOnClickListener { }
        btnLower.setOnClickListener { }
        btnAbs.setOnClickListener { }

    }
}