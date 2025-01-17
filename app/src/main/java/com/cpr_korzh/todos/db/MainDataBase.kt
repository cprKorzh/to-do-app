package com.cpr_korzh.todos.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cpr_korzh.todos.entities.LibraryItem
import com.cpr_korzh.todos.entities.ListItem
import com.cpr_korzh.todos.entities.ListNames
import com.cpr_korzh.todos.entities.NoteItem

@Database (entities = [LibraryItem::class, NoteItem::class,
    ListItem::class, ListNames::class], version = 1)
abstract class MainDataBase : RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "todo_list.db"
                ).build()
                instance
            }
        }
    }
}