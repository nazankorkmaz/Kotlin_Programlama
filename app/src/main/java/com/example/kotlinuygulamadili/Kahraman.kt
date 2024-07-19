package com.example.kotlinuygulamadili

// bunu kalıtım yapıcagım ıcın open demem lazım yoksa final kabul eder baska yerdenn cagırtmaz
open class Kahraman (var isim: String, var ozelGuc: String){
    fun kos(){
        println("${this.isim} kosuyor....")
    }

    open fun baskaOzellik(){   // polymorfizim yapcem
        println("ben max bu kadar")
    }
}