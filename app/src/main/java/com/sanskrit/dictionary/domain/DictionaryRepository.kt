package com.sanskrit.dictionary.domain

import com.sanskrit.dictionary.data.model.Word

interface DictionaryRepository {
    suspend fun getAll(): List<Word>
    suspend fun search(query: String): List<Word>
    suspend fun add(word: Word)
    suspend fun update(word: Word)
    suspend fun delete(word: Word)
}