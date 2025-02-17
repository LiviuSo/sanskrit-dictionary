package com.sanskrit.dictionary.data.model

import androidx.room.Dao

@Dao
data class Word(
    val devanagari: String,
    val iast: String,
    val english: String,
    val romanian: String
)
