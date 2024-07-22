package com.example.kotlinuygulamadili
//Composition ornegi
class Filmler(var film_id:Int,
              var film_Ad:String,
              var film_yil:Int,
              var kategori: Kategoriler,
              var yonetmen:Yonetmenler) {
}