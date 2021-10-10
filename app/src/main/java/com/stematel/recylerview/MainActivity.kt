package com.stematel.recylerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gambar1,
                "gambar 1",
                "gambar satu"
            ),
            Superhero(
                R.drawable.gambar2,
                "gambar 2",
                "gambar dua"
            ),
            Superhero(
                R.drawable.gambar3,
                "gambar 3",
                "gambar tiga"
            ),
            Superhero(
                R.drawable.gambar1,
                "gambar 4",
                "gambar satu"
            ),
            Superhero(
                R.drawable.gambar2,
                "gambar 5",
                "gambar dua"
            ),
            Superhero(
                R.drawable.gambar3,
                "gambar 6",
                "gambar tiga"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= superheroAdapter(this,superheroList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    
}