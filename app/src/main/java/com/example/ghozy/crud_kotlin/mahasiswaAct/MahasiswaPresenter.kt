package com.example.ghozy.crud_kotlin.mahasiswaAct

import android.util.Log
import com.example.ghozy.crud_kotlin.model.ResponseMahasiswa
import com.example.ghozy.crud_kotlin.network.InitRetrofit
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg
import retrofit2.Call
import retrofit2.Response

class MahasiswaPresenter(
    private val view: MahasiswaView
) {

    fun getMahasiswa() {
        view.showLoading()
        //inisialisasi
        val initRetrofit = InitRetrofit().getInitInstance()
        //get all data
        val request = initRetrofit.getMahasiswa()

        request.enqueue(object : retrofit2.Callback<ResponseMahasiswa> {
            override fun onResponse(call: Call<ResponseMahasiswa>, response: Response<ResponseMahasiswa>) {
              view.hideLoading()
                Log.d("Tag", "get Data : " + response.toString())

                async(UI){
                    val dataMahasiswa = bg {
                        response.body()?.result
                    }

                    view.showMahasiswa(dataMahasiswa.await())
                }

            }


            override fun onFailure(call: Call<ResponseMahasiswa>, t: Throwable) {
                Log.d("Tag", "Error Message : " + t.toString())
                view.hideLoading()
                view.showToast(t?.message)
            }


        })


    }


}