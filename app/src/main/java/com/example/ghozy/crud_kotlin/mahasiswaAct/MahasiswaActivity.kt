package com.example.ghozy.crud_kotlin.mahasiswaAct

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ProgressBar
import com.example.ghozy.crud_kotlin.R
import com.example.ghozy.crud_kotlin.adapter.MahasiswaAdapter
import com.example.ghozy.crud_kotlin.model.MahasiswaItem
import org.jetbrains.anko.ctx
import org.jetbrains.anko.toast

class MahasiswaActivity : AppCompatActivity(), MahasiswaView {
    override fun showLoading() {
        progressBar?.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressBar?.visibility = View.INVISIBLE
    }

    override fun showMahasiswa(data: List<MahasiswaItem>?) {

        maha.clear()
        if (data!= null){
            maha.addAll(data)

        }
        adapter?.notifyDataSetChanged()

    }

    override fun showToast(message: String?) {
        toast(message.toString())
    }

    var progressBar: ProgressBar? = null
    var presenter: MahasiswaPresenter? = null
    var adapter: MahasiswaAdapter? = null
    var maha: MutableList<MahasiswaItem> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mahasiswa)

        var layoutMahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)
        layoutMahasiswa.layoutManager = LinearLayoutManager(ctx)

        presenter = MahasiswaPresenter(this)
        presenter?.getMahasiswa()


        //event klik

        adapter = MahasiswaAdapter(maha) {

        }

        layoutMahasiswa.adapter = adapter

    }

}
