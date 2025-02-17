package com.sanskrit.dictionary.data.source

import com.sanskrit.dictionary.data.model.Word

class DictionaryDataSourceImplc: DictionaryDataSource {
    override suspend fun getAll(): List<Word> {
        TODO("Not yet implemented")
    }

    override suspend fun search(query: String): List<Word> {
        TODO("Not yet implemented")
    }

    override suspend fun add(word: Word) {
        TODO("Not yet implemented")
    }

    override suspend fun update(word: Word) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(word: Word) {
        TODO("Not yet implemented")
    }
}