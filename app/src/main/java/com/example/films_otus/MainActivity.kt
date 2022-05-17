package com.example.films_otus

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.films_otus.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        textView1 = findViewById(R.id.film1)
        textView2 = findViewById(R.id.film2)
        textView3 = findViewById(R.id.film3)


   findViewById<Button>(R.id.button).setOnClickListener(){
       textView1.setTextColor(Color.RED)
        val i = Intent(this, FilmsDetails::class.java)
        i.putExtra("poster", "IT")
        startActivity(i)
    }
        findViewById<Button>(R.id.button2).setOnClickListener(){
            textView2.setTextColor(Color.RED)
            val i = Intent(this, FilmsDetails::class.java)
        i.putExtra("poster", "IT2")
        startActivity(i)
    }

        findViewById<Button>(R.id.button3).setOnClickListener(){
            textView3.setTextColor(Color.RED)
        val i = Intent(this, FilmsDetails::class.java)
        i.putExtra("poster", "Avatar")
        startActivity(i)
    }

        findViewById<Button>(R.id.invite).setOnClickListener(){
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/friends"))
        startActivity(i)
    }}

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("film1Color", textView1.currentTextColor)
        outState.putInt("film2Color", textView2.currentTextColor)
        outState.putInt("film3Color", textView3.currentTextColor)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textView1.setTextColor(savedInstanceState.getInt("film1Color", Color.BLACK))
        textView2.setTextColor(savedInstanceState.getInt("film2Color", Color.BLACK))
        textView3.setTextColor(savedInstanceState.getInt("film3Color", Color.BLACK))


    }
}

