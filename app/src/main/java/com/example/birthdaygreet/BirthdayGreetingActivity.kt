package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object { //Just like static objects NAME_EXTRA key's value will be constant in all activities
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA) //Get the name from MainActivity
        birthdayGreeting.text = "Happy Birthday\n$name!" //Fill the birthdayGreeting textView with this present in activity_birthday_greeting.xml
        //This will be printed on clicking that button in a new activity of birthdayGreet activity
    }
}
