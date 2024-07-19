package com.example.mvvm_notitas.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteProvider
import com.example.mvvm_notitas.model.QuoteModel

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun ramdomQuote() {
        val currentQuote = QuoteProvider.ramdom()
        quoteModel.postValue(currentQuote)
    }
}