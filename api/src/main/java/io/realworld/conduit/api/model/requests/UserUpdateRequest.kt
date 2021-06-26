package io.realworld.conduit.api.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import io.realworld.conduit.api.models.entities.UserUpdateData

@JsonClass(generateAdapter = true)
data class UserUpdateRequest(
    @Json(name = "user")
    val user: UserUpdateData
)