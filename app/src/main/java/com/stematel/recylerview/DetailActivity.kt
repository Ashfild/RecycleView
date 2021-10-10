package com.stematel.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgsuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val namesuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descsuperhero = findViewById<TextView>(R.id.tv_item_description)

        if (superhero != null) {
            imgsuperhero.setImageResource(superhero.imgsuperhero)
            namesuperhero.text = superhero.namesuperhero
            descsuperhero.text = superhero.descsuperhero
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}