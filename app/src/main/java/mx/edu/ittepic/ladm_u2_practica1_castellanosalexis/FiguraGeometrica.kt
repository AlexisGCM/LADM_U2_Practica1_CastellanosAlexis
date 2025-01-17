package mx.edu.ittepic.ladm_u2_practica1_castellanosalexis

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
        }
    }



    fun caida( alto:Int){
        y+=incY
        if (y >= alto) {
            y = 0f
        }
    }
    fun quitarNubes(){
        x-=incX
        y
    }
    fun quitarSol(){
        x+=incX
        y
    }
}