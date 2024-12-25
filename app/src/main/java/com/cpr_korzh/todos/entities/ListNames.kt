package com.cpr_korzh.todos.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity (tableName = "list_names")
data class ListNames(
    @PrimaryKey (autoGenerate = true)
    val id: Int?, //Null?
    @ColumnInfo (name = "name")
    val name: String,
    @ColumnInfo (name = "time")
    val time: String,
    @ColumnInfo (name = "allItemCount")
    val allItemCount: Int,
    @ColumnInfo (name = "checkedItemsCounter")
    val checkedItemsCounter: Int,
    @ColumnInfo (name = "itemsIds")
    val itemsIds: Int,
): Serializable // Same module.exports for exp to another entity
