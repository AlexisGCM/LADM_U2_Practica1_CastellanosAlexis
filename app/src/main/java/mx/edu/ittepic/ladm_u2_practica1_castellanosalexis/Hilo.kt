package mx.edu.ittepic.ladm_u2_practica1_castellanosalexis

class Hilo(P:MainActivity):Thread(){
    var puntero = P

    override fun run() {
        super.run()
        //para que la nieve caiga despues de 10 segundos iniciada la .apk***********************
        fun esperar (segundos :Long){
            try {
                Thread.sleep(segundos * 1000)

            } catch (e: Exception) {
                println(e)
            }
        }
        esperar(10)
        //********************************************
          while(true){
            sleep(20)
            puntero.runOnUiThread {
              puntero.lienzo!!.animarCirculo()
            }
        }
    }

}