package com.example.kotlinuygulamadili

class Sanatci(var isim : String, var yas : Int, var enstruman : String) : Insan(), Dans,Sarki {
// eger val ya da var koymazsan private kabul eder ve mainden degistiremezsin yukarıya

    var sacPublic : String = "sari"
    private val sacPrivate : String = "kahverengi" // buna mainActivityden erisemedim

    fun sacPrivateCagir (){  // getter mantıgı
        println("Ozel sac rengi : ${sacPrivate}")
    }

    // encapsulation
    var gozRengi = ""
        private set
        public get

    fun soyle(){
        println("${this.isim} şarkı soyluyor....")
    }

    private fun sarkisoyle(){
        println("${this.isim} şarkıyi public  soyluyor....")
    }

    init {
        println("nesne olusturuludu") // bu basta konstructır olusturuluyor diye kullanılmaz genelde
        // ama mesela bi sey cekmeden once kontrol yapmak istersen bunu kullanırsın
    }

    // ınterfaceden abstract sınıfı alırsan ıcındeki abstract fonksiyonları da implement etmen gerekir abstract yoksa fun basında gerekmez
    override fun abstractTest() {  // javada buna extends
        TODO("Not yet implemented")
    }

    // yine ınterfacelerden de zorunlu implement yapman lazım
    override fun dansEt() {   // javada buna implements denir
        TODO("Not yet implemented")
    }

    override fun sarkiSoyle() {
        TODO("Not yet implemented")
    }

    /*
    Visibility modifiers
    - private : özel yani sadece o sınıf icinden erisilebiliyor
    -protected: korunmalı sadece .kt uzantılı dosyasından erisilebilir oluyor
    - internal: iç yani sadec o modulu icerisinden erisilebilir olur
    - public: acık yani her  yerden erisilebilir
    */

}