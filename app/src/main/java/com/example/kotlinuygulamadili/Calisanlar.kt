package com.example.kotlinuygulamadili

class Calisanlar(val isim : String,   maas : Double, var deparman : String, var yas : Int) {

    private var maas2  = maas
        private set




    fun maasGoster(): Double{
        //println("${this.isim} maası : ${maas2}")
        return maas2
    }
}