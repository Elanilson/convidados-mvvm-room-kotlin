package com.apkdoandroid.kotlin_convidados.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "convidados")
 class Convidado {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Int =0
    @ColumnInfo(name = "nome")
    var nome: String =""
    @ColumnInfo(name = "presenca")
    var presenca: Boolean = false;
}