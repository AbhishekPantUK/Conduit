package io.realworld.conduit.api.models.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import io.realworld.conduit.api.models.entities.LoginData
import io.realworld.conduit.api.models.entities.SignupData

@JsonClass(generateAdapter = true)
data class LoginRequest(
    @Json(name = "user")
    val user: LoginData
)