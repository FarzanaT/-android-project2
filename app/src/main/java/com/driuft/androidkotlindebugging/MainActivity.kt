package com.driuft.androidkotlindebugging

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.driuft.androidkotlindebugging.ui.*
import java.text.SimpleDateFormat
import java.util.*

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.coroutineContext
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class MainActivity : AppCompatActivity() {

    private val challengeOneButton: Button get() = findViewById(R.id.challenge_one)
    private val challengeTwoButton: Button get() = findViewById(R.id.challenge_two)
    private val challengeThreeButton: Button get() = findViewById(R.id.challenge_three)
    private val challengeFourButton: Button get() = findViewById(R.id.challenge_four)
    private val challengeFiveButton: Button get() = findViewById(R.id.challenge_five)
    private val challengeSixButton: Button get() = findViewById(R.id.challenge_six)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        challengeOneButton.setOnClickListener { launchHelloWorldActivity() }
        challengeTwoButton.setOnClickListener { launchNumSumActivity() }
        challengeThreeButton.setOnClickListener { launchCurrentDayActivity() }
        challengeFourButton.setOnClickListener { launchRandomColorActivity() }
        challengeFiveButton.setOnClickListener { launchPrintListActivity() }
        challengeSixButton.setOnClickListener { launchFavoriteNumberActivity() }
    }

    private fun launchHelloWorldActivity() {
        val i = Intent(this, HelloWorldActivity::class.java)
        startActivity(i)
    }

    private fun launchNumSumActivity() {
        val i = Intent(this, NumSumActivity::class.java)
        startActivity(i)
    }

    private fun launchCurrentDayActivity(): String {
        val formatter = SimpleDateFormat("dd")
        val date = Date()

       // val day : String = getDayOfMonth();
        val i = Intent(this, CurrentDayActivity::class.java)
        startActivity(i)
        return formatter.format(date).toString()
    }

//    private fun getDayOfMonth(): String {
//
//
//    }


    private fun launchRandomColorActivity() {
        val i = Intent(this, RandomColorActivity::class.java)
        startActivity(i)
       // getRandomColor();
    }

    private fun launchPrintListActivity() {
        val i = Intent(this, PrintListActivity::class.java)
        startActivity(i)
    }

    private fun launchFavoriteNumberActivity() {
        val i = Intent(this, FavoriteNumber::class.java)
        startActivity(i)
    }
}