package com.example.love_calculator_hw_5_2

import com.google.gson.annotations.SerializedName

data class LoveModel (
    @SerializedName("fname")
    var firstName: String,
    @SerializedName("sname")
    var secondName: String,
    var percentage: String,
    var result: String
) : java.io.Serializable
