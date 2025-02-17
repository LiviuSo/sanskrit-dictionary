package com.sanskrit.dictionary.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sanskrit.dictionary.domain.DictionaryRepository
import kotlinx.coroutines.launch

class DictionaryViewModel(private val repository: DictionaryRepository) : ViewModel() {

    fun getAllWords() = viewModelScope.launch { repository.getAll() }
}