package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var welcomeText: String
lateinit var tvWelcome: TextView
class Dashboard : AppCompatActivity() {

//    lateinit var welcomeText: String
//    lateinit var tvWelcome: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard2)

        welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);
    }
}