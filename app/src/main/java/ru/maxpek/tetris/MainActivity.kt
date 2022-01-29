package ru.maxpek.tetris

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btnNewGame = findViewById<Button>(R.id.new_game)
        val btnResetScore = findViewById<Button>(R.id.reset_score)
        val btnExit = findViewById<Button>(R.id.exit)
        tvHighScore = findViewById<TextView>(R.id.score)

        btnNewGame.setOnClickListener(this::onBtnNewGameClick)
        btnResetScore.setOnClickListener { this.onBtnResetScoreClick() }
        btnExit.setOnClickListener { this.onBtnExitClick() }

    }

    private fun onBtnNewGameClick(view: View){
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    private fun onBtnExitClick(){
        exitProcess(0)
    }

    private fun onBtnResetScoreClick(){ exitProcess(0)}


}