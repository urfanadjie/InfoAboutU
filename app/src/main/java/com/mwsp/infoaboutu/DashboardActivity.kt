package com.mwsp.infoaboutu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var bacaBerita : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        bacaBerita = findViewById(R.id.btn_lihat)
        bacaBerita.setOnClickListener(this)

    }
    override fun onClick(p0: View?) {
        val intent = Intent(this, ReadNewsActivity::class.java)
        startActivity(intent)
    }
}