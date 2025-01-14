package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Director
import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Violin

// La clase Violinista hereda y además implementa las interfaces Musico, Violin y Director
class Violinista(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Musico, Violin, Director {

    // Implementacion del metodo ensayar de la interfaz Musico
    override fun ensayar() {
        println("El violinista asiste al ensayo general ")
    }

    // Implementacion del metodo interpretar de la interfaz Musico
    override fun interpretar() {
        println("El violinista ejecuta una obra musical para el publico")
    }

    // Implementacion del metodo dirigir de la interfaz Director
    override fun dirigir() {
        println("EL violinista está dirigiendo a la orquesta")
    }

    // Implementacion del metodo funcion de la interfaz Musico
    override fun funcion() {
        println("Su funcion es ser violinista")
    }

    // Implementacio del metodo tocarViolin de la interfaz Violin
    override fun tocarViolin() {
        println("Su forma de tocar el violin cautiva a la gente")
    }


}