package com.example.randomizer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility
import com.example.randomizer.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        var a = 100


        bindingClass.button.setOnClickListener {
            if (bindingClass.editTextNumber.text.isNotEmpty())
                a = bindingClass.editTextNumber.text.toString().toInt()
            bindingClass.tv.text = Random.nextInt(1, a + 1).toString()
        }
    }
}