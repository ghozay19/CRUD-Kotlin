package com.example.ghozy.crud_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ghozy.crud_kotlin.mahasiswaAct.MahasiswaActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mahasiswa.setOnClickListener {
            ctx.startActivity<MahasiswaActivity>()
        }
    }
}
