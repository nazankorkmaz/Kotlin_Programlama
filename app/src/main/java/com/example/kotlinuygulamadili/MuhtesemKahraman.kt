package com.example.kotlinuygulamadili

class MuhtesemKahraman(isim: String, ozelGuc: String) : Kahraman(isim, ozelGuc) {
// mesela burda val var olmadıgı icin mainden degsitiremem cagırabilirim

    override fun baskaOzellik(){
        println("ben muhtesem ozellikler yapmak")
    }
}