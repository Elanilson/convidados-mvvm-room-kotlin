package com.apkdoandroid.kotlin_convidados.repositorio

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.apkdoandroid.kotlin_convidados.constants.DataBaseConstants
import com.apkdoandroid.kotlin_convidados.model.Convidado
import java.lang.Exception

class Repositorio  (context: Context){

    private val banco = Banco.getDataBase(context).convidadoDao()


    fun insert(convidado: Convidado) :Boolean{
        return banco.insert(convidado) > 0
    }

    fun update(convidado: Convidado) : Boolean{
        return banco.updadte(convidado) > 0
    }

    fun delete(convidadoId: Int) {
        val convidado = get(convidadoId)

        banco.delete(convidado)
    }


    fun getAll() : List<Convidado>{
        return banco.getAll()
    }


    fun getPresentes() : List<Convidado>{
       return banco.getPresentes()
    }


    fun getAusentes() : List<Convidado>{
        return banco.getAusentes()
    }

    fun get(id: Int) : Convidado {
        return banco.get(id)
    }
}