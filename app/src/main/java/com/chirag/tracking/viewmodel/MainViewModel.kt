package com.chirag.tracking.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.chirag.tracking.repository.MainRepository

class MainViewModel @ViewModelInject constructor(val repository: MainRepository) : ViewModel() {
}