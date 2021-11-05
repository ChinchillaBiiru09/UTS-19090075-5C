package com.example.uts_19090075

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_desciption.*

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desciption)
        imageViewDetail.setImageResource(intent.getIntExtra("gambar", 1))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewHargaDetail.text = intent.getStringExtra("harga")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                android.R.id.home ->{
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }

        fun finish() {
            super.finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}