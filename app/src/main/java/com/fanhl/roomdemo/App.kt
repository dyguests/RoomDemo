package com.fanhl.roomdemo

import android.app.Application
import com.fanhl.roomdemo.room.AppDatabase
import android.arch.persistence.room.Room


class App : Application() {
    lateinit var db: AppDatabase
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext,
                AppDatabase::class.java, "database-name").build()
    }
}
