package com.cpr_korzh.todos.activities

import android.app.Application
import com.cpr_korzh.todos.db.MainDataBase

class MainApp : Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}