package mx.edu.ittepic.ladm_u2_practica1_castellanosalexis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    var lienzo  : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo!!)

        Hilo(this).start()
    }

}
