package com.example.ghozy.crud_kotlin.model

import com.google.gson.annotations.SerializedName


data class ResponseDosen(

    @field:SerializedName("result")
	val result: List<DosenItem?>? = null,

    @field:SerializedName("kode")
	val kode: Int? = null
)