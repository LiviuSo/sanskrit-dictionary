package com.sanskrit.dictionary.data.source

import com.sanskrit.dictionary.data.model.Word

interface DictionaryDataSource {
    suspend fun getAll(): List<Word>
    suspend fun search(query: String): List<Word>
    suspend fun add(word: Word)
    suspend fun update(word: Word)
    suspend fun delete(word: Word)
}