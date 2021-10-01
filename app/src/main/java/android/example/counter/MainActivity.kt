package android.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var count_textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count_textView = findViewById(R.id.count_textView)
        button = findViewById(R.id.button)
        var clickCounter = 0

        button.setOnClickListener {
            clickCounter += 1
            count_textView.text = clickCounter.toString().padStart(4,'0')
        }
    }
}