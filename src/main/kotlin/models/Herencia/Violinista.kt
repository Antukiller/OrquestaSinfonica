package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Director
import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Violin

class Violinista(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Musico, Violin, Director {
    override fun ensayar() {
        println("El violinista asiste al ensayo general ")
    }

    override fun interpretar() {
        println("El violinista ejecuta una obra musical para el publico")
    }

    override fun dirigir() {
        println("EL violinista está dirigiendo a la orquesta")
    }


    override fun funcion() {
        println("Su funcion es ser violinista")
    }

    override fun tocarViolin() {
        println("Su forma de tocar el violin cautiva a la gente")
    }


}