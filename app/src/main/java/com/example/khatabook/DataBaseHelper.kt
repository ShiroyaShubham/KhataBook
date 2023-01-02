package com.example.khatabook

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import android.widget.Toast

class DataBaseHelper(var context: Context) : SQLiteOpenHelper(context,"MyCategory.db",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        var sql="create table categoryDetail(categoryId integer primary key autoincrement,name text)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    fun insertData(name: String) {

        var db=writableDatabase
        var c=ContentValues()
        c.put("name",name)

        val result=db.insert("categoryDetail",null,c)
        Log.e("TAG", "insertData: $result")
    }

    fun displayData(){

        var db=readableDatabase
        var sql="select * from categoryDetail"
        var cursor=db.rawQuery(sql,null)

        if(cursor.count>0){

        }else
        {
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show()
        }
    }
}