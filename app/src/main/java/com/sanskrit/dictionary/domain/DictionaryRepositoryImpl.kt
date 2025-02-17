package com.sanskrit.dictionary.domain

import com.sanskrit.dictionary.data.model.Word
import com.sanskrit.dictionary.data.source.DictionaryDataSource

class DictionaryRepositoryImpl(private val dataSource: DictionaryDataSource) : DictionaryRepository {
    override suspend fun getAll(): List<Word> {
        return dataSource.getAll()
    }

    override suspend fun search(query: String): List<Word> {
        return dataSource.search(query)
    }

    override suspend fun add(word: Word) {
        dataSource.add(word)
    }

    override suspend fun update(word: Word) {
        dataSource.update(word)
    }

    override suspend fun delete(word: Word) {
        dataSource.delete(word)
    }
}