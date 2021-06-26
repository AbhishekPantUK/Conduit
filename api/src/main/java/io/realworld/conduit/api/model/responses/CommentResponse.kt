package io.realworld.conduit.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import io.realworld.conduit.api.models.entities.Comment

@JsonClass(generateAdapter = true)
data class CommentResponse(
    @Json(name = "comment")
    val comments: Comment
)