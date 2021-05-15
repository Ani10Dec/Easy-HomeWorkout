package com.easy.easyworkout.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.easy.easyworkout.R

class StartCountDownActivity : AppCompatActivity() {

    // Global Variables
    lateinit var toolbar: Toolbar
    lateinit var btnSkip: Button
    lateinit var tvCountDown: TextView
    var state: Boolean = true
    var count: Int = 25
    val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_count_down)
        title = "Start Workout"

        // HOOKS
        toolbar = findViewById(R.id.toolbar)
        btnSkip = findViewById(R.id.btn_skip)
        tvCountDown = findViewById(R.id.tv_countDown)

        // Setting toolbar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        // Intent to Workout Activity
        btnSkip.setOnClickListener {
//            intentToWorkout()
            state = false
        }

        handler.postDelayed(object : Runnable {
            override fun run() {
                if (--count >= 0) {
                    handler.postDelayed(this, 1000L)
                    tvCountDown.text = count.toString()
                    return
                }
                handler.removeCallbacks(this)
//                intentToWorkout()
                state = false
            }

        }, 1000L)

    }

    private fun intentToWorkout() {
        if (state)
            startActivity(Intent(this, WorkoutPlanActivity::class.java))
    }
}