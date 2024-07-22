package com.example.kotlinuygulamadili

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  degiskenler ve veri tipleri
        println(5/2)

        var x = 10
        println(x+10)
        x = 50
                 // Implicit yani türünü yazmadan tanımlama
        val y = 30
        // y = 50  hata verir cunku val degismez
        println(y * 50)

                // explicit : yani acık sekilde tanımlama
        var ornek : Long = 10
        println(ornek / 2)

        var ornekShort : Short = 20
        println(ornekShort - 6)

        var ornekByte : Byte = 15
        //ornekByte = 10000  hata verir cunku 127den buyuk
        //mesela UByte da var bunların ve 255'e kadar tutar
        // Yani unsignedlar ve sonuna floattaki gibi sonuna lu koyman lazım

        //camelCase -- snakeCase
        x = 50
        val sonuc = x+y

        // Integerın türü 4 tanedir: int, short,Long,Byte
        // Kesirlilerin 2 türü : Double ve Float : double gelir direk

        val pi = 3.14

        println(5/2)  // sonuc 2
        println(5.0 / 2.0) // sonuc = 2.5

        val ornekFloat : Float = 2.25f

        // Stringler

        val benimString = "Benim benim benim"
        println(benimString)

        val isim = "nazan"
        var ben = "korkmaz"
        println(isim.uppercase())

        //sonradan initilaze etmek
        val benimStr : String
        benimStr = "nazannazannazan"

        // conversation ---> cevirme
        val yas = "25"
        val yasInt =  yas.toInt()
        println(yasInt * 20)  // ama mantıklı olması lazım

        // Booleans
        println(yas.toInt() > 18)

        // Veri yapıları
        // -Array : Diziler

        val benimDizim = arrayOf("nazan","korkmaz",yas,5)
        println(benimDizim[0])
        println(benimDizim.last())
        benimDizim[0] = "yeniNazan"
        // val olmasına ragmen dizilerde degisiklik yapilabilir
        println(benimDizim.get(2))

        // dizilere yeni eleman eklenemez

        // Listeler ArrayList

        val isimListesi = arrayListOf("nazan","Korkmaz","me",5)
        println(isimListesi.size)
        isimListesi.add("yeni eleman ekledim")
        isimListesi.remove("me")

        // Listeleri sonradan tanımlayabilrsin ama türünü vermen lazım
        val yeniListe1 = arrayListOf<Int>()
        val yeniListe2 = ArrayList<Int>()
        val karisikBosLite = arrayListOf<Any>() // karisik tur koyabilirsin

        // Set
        // İçinde uniqe eleman barındırır ve indekslenemez

        val setDizi = setOf(10,10,20,330)
        println(setDizi.size)  // 3 boyutlu dicek
        // buarad get ya da koseli parantez yok

        setDizi.forEach { println(it) } // her birini it olarak alıp yazdırır

        val hashSet = HashSet<String>()  // hash mantıgı ile set
        hashSet.add("Nazan")
        // mesele 15 dizide var mı sorununa daha hızlı cevao verir


        // Map
        // sozluk de denir anahtar-deger

        val yemekMap = hashMapOf<String,Int>()
        yemekMap.put("Elma",10)
        yemekMap.put("armut",20)

        println(yemekMap["Elma"])
        println(yemekMap.get("Elma"))


        // when uzun uzun elif yazmanın diğer yolu
        val notRakam = 0
        var notString = ""

        when(notRakam){
            0 -> notString = "Geçersiz"
            1-> notString = "zayıf"
            2-> notString = "orta"
            else -> notString = "harika"
        }
        println(notString)

        val sonucFonk = fonksiyonDeneme(2,4)
        println(sonucFonk)

        val batman = Superkahraman("Bruce",30,"patron")
        batman.yas = 28
        println(batman.yas)

        val nullibilityDeneme : Int? = null
        nullibilityDeneme?.let{ // let yani null degilse calistir demektir
            println(it*2)
        }

        // OOP Prensibleri

        var selin = Sanatci("selin",20,"gitar")
        selin.yas = 22
        selin.soyle()  // mesela bi sey donmedigi icin sonunda Unit yazıyor
        //selin.sarkisoyle()  bu hatali olur cunku erisemiyor private
        selin.sacPublic = "koyu sari"
        selin.sacPrivateCagir()
        //selin.gozRengi = "kahve" degistiremem  artik
        selin.gozRengi // cagirabilirim ama


        //Inheritence -> Kalıtım
        var kahraman= Kahraman("batman","zengin zengin")
        kahraman.isim="batman kisisi"
        kahraman.kos()

        var kahramanInheritence = MuhtesemKahraman("superman","ucar kacar")
        //kahramanInheritence.isim = "lalall"
        kahramanInheritence.kos()

        val arrayKahraman = arrayOf(kahraman,kahramanInheritence)
        arrayKahraman.forEach {
            println(it.baskaOzellik())  // polymorfizim farklı gelcek ikisinde de
        }

        // Abstraction -> soyutlama : sınıfların nasıl gorulecegini anlamak icin kullanılır
        // Abstract Class ve Interface

        // Sadece 1 sınıftan kalıtım alınır
        //var insan = Insan()  abstract sınıftan nesne olıusturulamaz

       // selin.abstractTest() // ama intefraceden fonku aldım


        // LAmbda fonksiyon
        //anonim fonksiyon olarak gecer ve fonksiyonları parametre olarak almak istenildiginde kullanılır


        val yazLambda = {verilenString: String -> println(verilenString) }
        yazLambda("yaz Lambda")

        val carpLambda = {a:Int , b:Int -> a * b}
        println(carpLambda(2,5))

        val carpLambda2 : (Int, Int) -> Int = {a,b -> a * b}
        println(carpLambda2)

        // Filter  --> istedigin seyi bulur ve diziye atar
        val benimListem = arrayListOf(1,2,5,3,10,11,25,66)
        val yeniKucukler = benimListem.filter { it < 10 }
        for ( a in yeniKucukler){
            println(a)
        }

        //Map --> bir seyi yeni bir seye donusturmek ıcın
        val karesiMap = benimListem.map { it *5 }

        println("buradyım")
        // Calisanlar projesi
        val kisi1 = Calisanlar("ahmet",20.888,"finans",29)
        val kisi2 = Calisanlar("ayşe", 25.500, "satış", 34)
        val kisi3 = Calisanlar("mehmet", 22.300, "yazılım", 27)
        val kisi4 = Calisanlar("fatma", 28.900, "finans", 31)
        val kisi5 = Calisanlar("ali", 24.700, "satış", 20)
        val kisi6 = Calisanlar("zeynep", 26.100, "yazılım", 28)
        val kisi7 = Calisanlar("hasan", 21.600, "finans", 32)
        val kisi8 = Calisanlar("ayhan", 23.800, "satış", 30)
        val kisi9 = Calisanlar("emine", 27.200, "yazılım", 33)
        val kisi10 = Calisanlar("selim", 29.500, "finans", 35)

        val calisanListe = arrayListOf(kisi1,kisi2,kisi3,kisi4,kisi5,kisi6,kisi7,kisi8,kisi9,kisi10)
        println(kisi2.isim)

        // isimlere degisiklik yapılmasın ve maaslar gozukmesin erisilmesin istiyoruz


        val yazilimcilar = calisanListe.filter {  it.deparman == "yazılım"}
        for (kisi in yazilimcilar){
            if ( kisi.yas >= 30){
                println(kisi.isim)
            }
        }
        val otuzdanBuyuk = yazilimcilar.filter { it.yas >= 30  }.map { it.maasGoster() }
        otuzdanBuyuk.forEach{println(it)}

        val yirmibesKucukIsim = calisanListe.filter { it.yas <25 }.map { it.isim }
        yirmibesKucukIsim.forEach{println(it)}

        println("-------------------")
        val benimListemm = arrayListOf<Int>(40,50,60,70,80,90)
        val benimDigerListem = arrayListOf<Int>(30,40,12,10,20,30)
        val benimMap = hashMapOf("IlkListe" to benimDigerListem, "IkinciListe" to benimListemm)
        println(benimMap.get("IlkListe")?.get(2))

        val scanner = Scanner(System.`in`)
        println("isim ve sayı giriniz :")
        //val name = scanner.next()
        //val number = scanner.nextInt()
        //nameRecycle(name,number)

        // İstenildiği kadar verş yollamak
        val t1 = toplam(1,2,3,4,5,6)
        println("t1 : $t1")

        // Extension fonksiyonlar kotlindeki sınıfları genisletmek icin kullanılan yontemdir
        // Int sınıfı ornegı:
        val sonucExtension = 5.carpi(2)
        println(sonucExtension)

        // sınıf onune konulan data kelimesi constr, getteri,sette,hahscode, equals gibi
        //yapıları otomatik olusturur. mesela sanatcınınki gibi ama daha detaylı kendisi yapıyor

        ucretBoyutEnam(BoyutEnam.Buyuk)

        val adres = Adres("İstanbul","Beylikdüzü")
        val kisi = Kisiler("Nazan",22,adres)
        println("Kisi il : ${kisi.adres.il}")
    }

    fun fonksiyonDeneme(a: Int,b:Int): Int{
        return(a+b)
    }

    // konsoldan girilen ismi tekrarı kadar yazdırmak
    fun nameRecycle(name : String, number :Int){

        for (num in 1..number ){
            println(name)
        }
    }

    // dizi gibi calisir tek tek atar iceriye
    fun toplam (vararg sayilar : Int): Int{
        var sonuc = 0
        for (s in sayilar){
            sonuc += s
        }
        return sonuc
    }

    fun Int.carpi(sayi : Int):Int{
        return this * sayi
    }

    fun ucretBoyutEnam(boyut:BoyutEnam){
        when(boyut){
            BoyutEnam.Buyuk -> println(40*30)
            BoyutEnam.Kucuk -> println(20*30)
            BoyutEnam.Orta -> println(30*30)
        }
    }


}