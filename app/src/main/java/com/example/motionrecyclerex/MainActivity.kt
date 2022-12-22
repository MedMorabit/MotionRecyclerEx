package com.example.motionrecyclerex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var adapterGames: AdapterGames
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler=findViewById<RecyclerView>(R.id.recyclerMain)

        val games:ArrayList<Game> = arrayListOf(
            Game(R.drawable.ic_apex_2,"Game01","this game is one of the best games in 2022"),
            Game(R.drawable.ic_apex_3,"Game02","this game is one of the best games in 2022"),
            Game(R.drawable.ic_dota_1,"Game03","this game is one of the best games in 2022"),
            Game(R.drawable.ic_dota_3,"Game04,","this game is one of the best games in 2022"),
            Game(R.drawable.ic_dota_4,"Game05,","this game is one of the best games in 2022")
        )
        adapterGames=AdapterGames(games)
        recycler.apply {
            adapter=adapterGames
            layoutManager=LinearLayoutManager(this@MainActivity)
        }



    }
}