package com.fanhl.roomdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fanhl.roomdemo.room.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            (application as App).db.userDao().insertAll(User().apply {
                uid = 1
                firstName = "Fan"
                lastName = "hl"
            })
        }
    }
}
