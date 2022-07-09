package com.apkdoandroid.kotlin_convidados.repositorio

import androidx.room.*
import com.apkdoandroid.kotlin_convidados.model.Convidado

@Dao
interface ConvidadoDao {

    @Insert
    fun insert(convidado: Convidado) : Long;
    @Update
    fun updadte(convidado: Convidado) : Int
    @Delete
    fun delete(convidado: Convidado)
    @Query("select * from convidados where id = :id")
    fun get(id :Int) : Convidado
    @Query("select * from convidados")
    fun getAll() : List<Convidado>
    @Query("select * from convidados where presenca = 1")
    fun getPresentes() : List<Convidado>
    @Query("select * from convidados where presenca = 0")
    fun getAusentes() : List<Convidado>

}