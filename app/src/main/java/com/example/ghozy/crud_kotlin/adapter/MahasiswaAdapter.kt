package com.example.ghozy.crud_kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ghozy.crud_kotlin.R
import com.example.ghozy.crud_kotlin.model.MahasiswaItem
import kotlinx.android.synthetic.main.list_mahasiswa.view.*

class MahasiswaAdapter(
    private val mahasiswa: List<MahasiswaItem>,
    private val listener: (MahasiswaItem) -> Unit
) :
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MahasiswaViewHolder = MahasiswaAdapter.MahasiswaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_mahasiswa, parent, false))

    override fun getItemCount(): Int = mahasiswa.size

    override fun onBindViewHolder(p0: MahasiswaViewHolder, p1: Int) {
        p0.bindItem(mahasiswa[p1], listener)

    }


    class MahasiswaViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(mahasiswa: MahasiswaItem, listener: (MahasiswaItem) -> Unit){

        itemView.tvNama.text = mahasiswa.mahasiswaNama
        itemView.tvNim.text = mahasiswa.mahasiswaNim
        itemView.tvAlamat.text = mahasiswa.mahasiswaAlamat
        itemView.tvNoTelp.text = mahasiswa.mahasiswaNotelp

        itemView.setOnClickListener {
            listener(mahasiswa)
        }



    }

    }


}