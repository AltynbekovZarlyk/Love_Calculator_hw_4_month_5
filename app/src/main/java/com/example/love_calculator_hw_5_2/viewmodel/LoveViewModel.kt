package com.example.love_calculator_hw_5_2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.love_calculator_hw_5_2.remote.LoveModel
import com.example.love_calculator_hw_5_2.repository.Repository

class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getPercentage(firstName, secondName)
    }
}