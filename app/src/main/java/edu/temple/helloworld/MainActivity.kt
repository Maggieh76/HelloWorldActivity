package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var clickMeButton: Button
    lateinit var nameEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        clickMeButton = findViewById(R.id.clickMeButton)
        nameEditText = findViewById(R.id.nameEditText)


        
        // Respond to button click event per specifications
        clickMeButton.setOnClickListener{
            var inpText = nameEditText.text
            var resp = "Hello, $inpText"
            displayTextView.text = resp


        }

    }
}