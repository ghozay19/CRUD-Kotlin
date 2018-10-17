package com.example.ghozy.crud_kotlin.model

import com.google.gson.annotations.SerializedName

data class Mahasiswa(

	@field:SerializedName("result")
	val result: List<ResultItem?>? = null,

	@field:SerializedName("kode")
	val kode: Int? = null
)