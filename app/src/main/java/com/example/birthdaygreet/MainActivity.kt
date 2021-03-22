package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {//onCreate(Bundle savedInstanceState) Function in Android:

//After Orientation changed then onCreate(Bundle savedInstanceState) will call and recreate the activity and load all data from savedInstanceState.
        // Basically Bundle class is used to stored the data of activity whenever above condition occur in app.
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val name = nameInput.editableText.toString() //took name as input in Editext with id as nameInput in activity_main.xml

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name) //to pass data through intent intent.putExtra(key,value) 
        //NAME_EXTRA will remain same evrywhere
        startActivity(intent)
    }
}
