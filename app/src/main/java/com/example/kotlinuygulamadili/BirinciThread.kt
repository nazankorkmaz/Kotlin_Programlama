package com.example.kotlinuygulamadili

class BirinciThread: Thread() {

    override fun run() {
        //super.run()  // bu ust sınıfınki kullanmıcaz

        for (i in 100..199){
            println("Biirnci Thread : $i")
            Thread.sleep(100)
        }

    }
}