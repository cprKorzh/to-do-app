package com.cpr_korzh.todos.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "list_item")
data class ListItem(
    @PrimaryKey (autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "itemInfo")
    val itemInfo: String?,
    @ColumnInfo(name = "itemChecked")
    val itemChecked: Int = 0,
    @ColumnInfo(name = "listId")
    val listId: Int,
    @ColumnInfo(name = "itemType")
    val itemType: String = "item",
)
