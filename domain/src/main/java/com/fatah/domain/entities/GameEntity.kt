package com.fatah.domain.entities

data class GameEntity(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val shortDescription: String?,
    val description: String?,
    val gameUrl: String,
    val genre: String,
    val platform: String,
    val publisher: String,
    val developer: String,
    val releaseDate: String,
    val freetogameProfileUrl: String,
    var screenshots: List<ScreenshotEntity>?
)
