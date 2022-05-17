package com.example.grocerryapp

class GroceryRepo(private val db : GroceryDatabase ) {
    suspend fun insert(item : GroceryItem) = db.getGroceryDao().insert(item)

    suspend fun delete(item : GroceryItem) = db.getGroceryDao().delete(item)

    suspend fun getAllGroceryItems() = db.getGroceryDao().getAllGroceryItems()
}