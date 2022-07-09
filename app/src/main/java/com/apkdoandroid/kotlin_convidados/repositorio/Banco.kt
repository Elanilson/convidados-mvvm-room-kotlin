package com.apkdoandroid.kotlin_convidados.repositorio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.apkdoandroid.kotlin_convidados.constants.DataBaseConstants
import com.apkdoandroid.kotlin_convidados.model.Convidado
@Database(entities = [Convidado::class], version = 1)
abstract class  Banco : RoomDatabase() {

    abstract  fun  convidadoDao() :ConvidadoDao

    companion object{
        private lateinit var INSTACE : Banco
        fun getDataBase(context: Context) : Banco{
           if (!::INSTACE.isInitialized){
              synchronized(Banco::class){
                  INSTACE = Room.databaseBuilder(context,Banco::class.java,"convidadoDb")
                      .allowMainThreadQueries()
                      .addMigrations(MIGRATION_1_2)
                      .build()
              }
           }
            return  INSTACE;
        }

        private val MIGRATION_1_2 :Migration = object  : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                TODO("Not yet implemented")
            }

        }
    }

}