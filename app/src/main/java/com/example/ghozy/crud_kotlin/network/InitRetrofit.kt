package com.example.ghozy.crud_kotlin.network

import com.example.ghozy.crud_kotlin.model.ResponseMahasiswa
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

class InitRetrofit {
    //function untuk inisialisa retrofit
    fun getInitRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("http://gojaydroid.000webhostapp.com/crud/")
            .addConverterFactory(GsonConverterFactory.create()).build()


    }

    //
    public fun getInitInstance(): ApiService {
        return getInitRetrofit().create(ApiService::class.java)
    }
}

interface ApiService {

    /**
    Ini Untuk Mahasiswa
     **/

    //insert Mahasiswa
    @GET("/mahasiswa/insert.php")
    fun insertMahasiswa(
        @Query("mahasiswa_nim") name: String,
        @Query("mahasiswa_nama") nim: String,
        @Query("mahasiswa_alamat") alamat: String,
        @Query("mahasiswa_notelp") notelp: String
    ): Call<ResponseMahasiswa>

    //get Mahasiswa
    @GET("mahasiswa/read.php")
    fun getMahasiswa(): Call<ResponseMahasiswa>

    //update Mahasiswa
    @FormUrlEncoded
    @POST("/mahasiswa/update.php")
    fun updateMahasiswa(
        @Query("mahasiswa_id") id: String,
        @Query("mahasiswa_nim") name: String,
        @Query("mahasiswa_nama") nim: String,
        @Query("mahasiswa_alamat") alamat: String,
        @Query("mahasiswa_notelp") notelp: String
    ): Call<ResponseMahasiswa>

    //delete Mahasiswa
    @FormUrlEncoded
    @POST("delete.php")
    fun deleteMahasiswa(@Field("mahasiswa_id") id: String)
            : Call<ResponseMahasiswa>

}