package com.example.grocerryapp

import androidx.lifecycle.LiveData
import androidx.room.*

/*
    Dao is an interface, methods to access the data are defined in it.
    it can either be an interface or an abstract class
    Dao don't have properties but they have methods in them to interact with the app's database

    When an @Insert method is called, Room inserts each passed entity instance into the corresponding database table.
    If the @Insert method receives a single parameter, it can return a long value, which is the new rowId for the inserted item

    The @Update annotation allows you to define methods that update specific rows in a database table.
    An @Update method can optionally return an int value indicating the number of rows that were updated successfully.

    The @Delete annotation allows you to define methods that delete specific rows from a database table.
    A @Delete method can optionally return an int value indicating the number of rows that were deleted successfully.

    The @Query annotation allows you to write SQL statements and expose them as DAO methods. Use these query methods to query
    data from your app's database, or when you need to perform more complex inserts, updates, and deletes.
    Room validates SQL queries at compile time. This means that if there's a problem with your query, a compilation error occurs
    instead of a runtime failure

*/
@Dao
interface GroceryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItem)

    @Delete
    suspend fun delete(item: GroceryItem)

    @Query("SELECT * FROM grocery_items")
    fun getAllGroceryItems() : LiveData<List<GroceryItem>>
}