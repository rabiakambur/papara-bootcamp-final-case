package com.rabiakambur.cookly.model

import com.google.gson.annotations.SerializedName

data class RecipesResponse(
    @SerializedName("results")
    val results: List<RecipesResultResponse>
)