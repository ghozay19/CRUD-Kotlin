package com.example.ghozy.crud_kotlin.model

import com.google.gson.annotations.SerializedName


data class DosenItem(

	@field:SerializedName("dosen_id")
	val dosenId: String? = null,

	@field:SerializedName("dosen_notelp")
	val dosenNotelp: String? = null,

	@field:SerializedName("dosen_nid")
	val dosenNid: String? = null,

	@field:SerializedName("dosen_nama")
	val dosenNama: String? = null,

	@field:SerializedName("dosen_matakuliah")
	val dosenMatakuliah: String? = null
)