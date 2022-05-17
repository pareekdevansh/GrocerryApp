package com.example.grocerryapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repo : GroceryRepo) : ViewModel() {
    fun insert(item : GroceryItem){
        GlobalScope.launch {
            repo.insert(item)
        }
    }
    fun delete(item: GroceryItem){
        GlobalScope.launch {
            repo.delete(item)
        }
    }
    fun getAllGroceryItems(){
        GlobalScope.launch {
            repo.getAllGroceryItems()
        }
    }
}