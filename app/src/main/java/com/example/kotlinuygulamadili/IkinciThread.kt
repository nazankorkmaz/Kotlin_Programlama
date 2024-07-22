package com.example.kotlinuygulamadili

class IkinciThread: Runnable {
    override fun run() {
       // TODO("Not yet implemented")
        for ( i in 200..299){
            println("İkinci Thread : $i")
            Thread.sleep(100)
        }
    }
}