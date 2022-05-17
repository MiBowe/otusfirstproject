package com.example.films_otus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import com.example.films_otus.databinding.ActivityFilmsDetailsBinding
class FilmsDetails : AppCompatActivity() {
    lateinit var bindingClass2: ActivityFilmsDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass2 = ActivityFilmsDetailsBinding.inflate(layoutInflater)
        setContentView(bindingClass2.root)
        val post = intent.getStringExtra("poster")
        when(post){
            "IT"->{ bindingClass2.ivPoster.setImageResource(R.drawable.it_poster)
                bindingClass2.filmDetails.text = getText(R.string.it_details)
            }
            "IT2"->{bindingClass2.ivPoster.setImageResource(R.drawable.it2_poster)
                bindingClass2.filmDetails.text = getText(R.string.it2_details)
            }
            "Avatar"-> {
                bindingClass2.ivPoster.setImageResource(R.drawable.avatar_poster)
                bindingClass2.filmDetails.text = getText(R.string.avatar_details)
            }
        }

    }
}
