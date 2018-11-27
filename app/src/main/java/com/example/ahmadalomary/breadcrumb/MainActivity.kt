package com.example.ahmadalomary.breadcrumb

import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.breadcrumb.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        crumb1.setOnClickListener { run() }
        crumb2.setOnClickListener { run2() }
        crumb3.setOnClickListener { run3() }
        crumb4.setOnClickListener { run4() }
        crumb5.setOnClickListener { run5() }
    }

    fun run() {
        (bread as MotionLayout).transitionToState(R.id.animate1_2)

    }

    fun run2() {
        (bread as MotionLayout).transitionToState(R.id.animate2_3)

    }

    fun run3() {
        (bread as MotionLayout).transitionToState(R.id.animate3_4)

    }

    fun run4() {
        (bread as MotionLayout).transitionToState(R.id.animate4_5)

    }

    fun run5() {
        (bread as MotionLayout).transitionToState(R.id.animate5_1)

    }
}
