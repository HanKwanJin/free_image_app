package com.han.free_image_app.data.models


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("full")
    val full: String? = null,
    @SerializedName("raw")
    val raw: String? = null,
    @SerializedName("regular")
    val regular: String? = null,
    @SerializedName("small")
    val small: String? = null,
    @SerializedName("thumb")
    val thumb: String? = null
)