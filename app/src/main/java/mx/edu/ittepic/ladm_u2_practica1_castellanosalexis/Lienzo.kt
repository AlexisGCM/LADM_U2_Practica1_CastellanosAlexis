package mx.edu.ittepic.ladm_u2_practica1_castellanosalexis

import android.graphics.*
import android.view.MotionEvent
import android.view.View

@Suppress("UNUSED_VALUE")
class Lienzo (P:MainActivity) : View(P){
    var puntero = P
    var circulo = FiguraGeometrica(1050, 50, 80)
    var circulo1 = FiguraGeometrica(100, 120, 40)
    var circulo2 = FiguraGeometrica(130, 140, 40)
    var circulo3 = FiguraGeometrica(120, 110, 40)
    var circulo4 = FiguraGeometrica(150, 120, 40)
    var circulo5 = FiguraGeometrica(170, 510, 70)
    var circulo6 = FiguraGeometrica(170, 580, 70)
    var circulo7 = FiguraGeometrica(550, 730, 50)
    var circulo8 = FiguraGeometrica(100, -15, 10)
    var circulo9 = FiguraGeometrica(400, -14, 10)
    var circulo10 = FiguraGeometrica(250, -13, 10)
    var circulo11 = FiguraGeometrica(650, -12, 10)
    var circulo12 = FiguraGeometrica(500, -11, 10)
    var circulo13 = FiguraGeometrica(850, -16, 10)
    var rectangulo = FiguraGeometrica(1, 700, 1200, 950)
    var rectangulo1 = FiguraGeometrica(150, 600, 50, 300)
    var rectangulo2 = FiguraGeometrica(450, 600, 500, 400)
    var rectangulo3 = FiguraGeometrica(700, 800, 100, 200)
    var punteroFiguraGeometrica: FiguraGeometrica? = null
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(0,188,212))

        //Circulo (Sol)
        paint.color = Color.YELLOW
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        //Nube
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(255,255,255)
        circulo1.pintar(canvas, paint)
        circulo2.pintar(canvas,paint)
        circulo3.pintar(canvas,paint)
        circulo4.pintar(canvas,paint)

        //Rectangulo (pasto)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(76,175,80)
        rectangulo.pintar(canvas, paint)

        //Rectangulo (Tronco)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(153,101,34)
        rectangulo1.pintar(canvas, paint)

        //Hojas
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(139,195,74)
        circulo5.pintar(canvas, paint)
        circulo6.pintar(canvas,paint)

        //Rectangulo (casa)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(197,133,35)
        rectangulo2.pintar(canvas, paint)
//************************************************************************************************************
        //Triangulo (casa)
        var a = Point(395,630)
        var b = Point(1000,630)
        var c = Point(395,630)

        paint.style = Paint.Style.FILL
        paint.color = Color.GRAY
        var pa = Path()
        pa.fillType = Path.FillType.EVEN_ODD
        pa.lineTo(a.x.toFloat(),a.y.toFloat())
        pa.moveTo(700f,400f)
        pa.lineTo(b.x.toFloat(),b.y.toFloat())
        //pa.moveTo(700f,400f)
        pa.lineTo(c.x.toFloat(),c.y.toFloat())
        //pa.moveTo(1000f,630f)
        pa.close()
        /*
        canvas.drawLine(395f,630f,700f,400f,paint)
        canvas.drawLine(1000f,630f,700f,400f,paint)
        canvas.drawLine(395f,630f,1000f,630f,paint)*/
        canvas.drawPath(pa,paint)
//*********************************************************************************************************
        //Ventana
        paint.style = Paint.Style.FILL
        paint.color = Color.LTGRAY
        circulo7.pintar(canvas, paint)

        //Rectangulo (puerta)
        paint.style = Paint.Style.FILL
        paint.color = Color.LTGRAY
        rectangulo3.pintar(canvas, paint)

        //Nieve
            paint.color = Color.WHITE
            circulo8.pintar(canvas, paint)
            circulo9.pintar(canvas, paint)
            circulo10.pintar(canvas, paint)
            circulo11.pintar(canvas, paint)
            circulo12.pintar(canvas, paint)
            circulo13.pintar(canvas, paint)
            circulo8.pintar(canvas, paint)
            circulo9.pintar(canvas, paint)
            circulo10.pintar(canvas, paint)
            circulo11.pintar(canvas, paint)
            circulo12.pintar(canvas, paint)
            circulo13.pintar(canvas, paint)
            paint.style = Paint.Style.FILL

    }


    fun animarCirculo() {
           circulo.quitarSol()
           circulo1.quitarNubes()
           circulo2.quitarNubes()
           circulo3.quitarNubes()
           circulo4.quitarNubes()
           circulo8.caida(1800)
           circulo9.caida(500)
           circulo10.caida(1080)
           circulo11.caida(1300)
           circulo12.caida(650)
           circulo13.caida(790)
           circulo8.caida(670)
           circulo9.caida(850)
           circulo10.caida(1000)
           circulo11.caida(750)
           circulo12.caida(800)
           circulo13.caida(920)
           circulo8.caida(500)
           circulo9.caida(687)
           circulo10.caida(1200)
           circulo11.caida(1114)
           circulo12.caida(840)
           circulo13.caida(980)
           invalidate()
    }

}