package com.example.ghozy.crud_kotlin.model

import com.google.gson.annotations.SerializedName


data class ResponseMahasiswa(

	@field:SerializedName("result")
	val result: List<MahasiswaItem>,

	@field:SerializedName("kode")
	val kode: Int? = null
)