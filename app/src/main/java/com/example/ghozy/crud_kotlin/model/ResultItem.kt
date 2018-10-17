package com.example.ghozy.crud_kotlin.model

import com.google.gson.annotations.SerializedName


data class ResultItem(

	@field:SerializedName("mahasiswa_alamat")
	val mahasiswaAlamat: String? = null,

	@field:SerializedName("mahasiswa_notelp")
	val mahasiswaNotelp: String? = null,

	@field:SerializedName("mahasiswa_nama")
	val mahasiswaNama: String? = null,

	@field:SerializedName("mahasiswa_id")
	val mahasiswaId: String? = null,

	@field:SerializedName("mahasiswa_nim")
	val mahasiswaNim: String? = null
)