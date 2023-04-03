package com.example.love_calculator_hw_5_2.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.love_calculator_hw_5_2.remote.LoveModel
import com.example.love_calculator_hw_5_2.remote.LoveService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    fun getPercentage(firstName:String,secondName:String): MutableLiveData<LoveModel>{
        val mutableLiveData = MutableLiveData<LoveModel>()
        LoveService().api.getPercentage(firstName,secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
             if (response.isSuccessful){
                mutableLiveData.postValue(response.body())
             }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}", )
            }

        })
        return mutableLiveData
    }
}