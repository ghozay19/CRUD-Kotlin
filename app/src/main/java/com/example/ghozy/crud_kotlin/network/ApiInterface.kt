package com.example.ghozy.crud_kotlin.network

import com.example.ghozy.crud_kotlin.model.Mahasiswa
import retrofit2.Call
import retrofit2.http.*
import rx.Observable

interface ApiInterface {

    @GET("read.php")
    fun  getDatas(): Call<Mahasiswa>

    fun getUser(): Call<Mahasiswa>
//    fun getUser(@Path("username") username: String): Observable<Mahasiswa>


    @POST("insert.php")
    fun send(
        @Field("mahasiswa_nim") nim: String,
        @Field("mahasiswa_nama") nama: String,
        @Field("mahasiswa_alamat") alamat: String,
        @Field("mahasiswa_notelp") notelp: String
    ): Call<Mahasiswa>

    @POST("delete.php")
    fun deleteData(@Field("mahasiswa_id") id: String): Call<Mahasiswa>

    @POST("update.php")
    fun updateData(
        @Field("mahasiswa_id") id: String,
        @Field("mahasiswa_nim") nim: String,
        @Field("mahasiswa_nama") nama: String,
        @Field("mahasiswa_alamat") alamat: String,
        @Field("mahasiswa_notelp") notelp: String
    ): Call<Mahasiswa>


}
