package com.example.ghozy.crud_kotlin.mahasiswaAct

import com.example.ghozy.crud_kotlin.model.MahasiswaItem

interface MahasiswaView {
    fun showLoading()
    fun hideLoading()
    fun showMahasiswa(data:List<MahasiswaItem>?)
    fun showToast(message: String?)
}