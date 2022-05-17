package com.example.grocerryapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// points about Room Entity
/*
    Instance of the Entity is stored in the database as data containing object.
    Every Instance is like a row of the data table,Data table has columns which are common to every entity.
    Entity Class is annotated by @Entity
    Unique Primary Key is a must for each room Entity
    by default, table name is the class name itself, this can be changed using (tableName = "new name") with Entity annotation
    each column name is property name by default, which also can be changed with @ColumnInfo(name = "new col name") annotation
*/

@Entity(tableName = "groceryEntities")
data class GroceryItem(
    @PrimaryKey val id : Int,

    @ColumnInfo(name = "ItemName") val itemName : String,
    @ColumnInfo(name = "Quantity") val quantity : Int,
    @ColumnInfo(name = "Rate") val rate : Int
)