package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Director
import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Piano

// La clase Pianista hereda de Persona y además implementa las interfaces Musico, Piano, y Director
class Pianista(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Musico, Piano, Director {

    // Implementación del metodo ensayar de la interfaz Musico
    override fun ensayar() {
        println("El pianista asiste al ensayo general")
    }

    // Implementación del metodo interpretar de la interfaz Musico
    override fun interpretar() {
        println("El pianista ejecuta una obra musical para el publico")
    }

    // Implementación del metodo dirigir de la interfaz Director
    override fun dirigir() {
        println("El pianista dirige a la orquesta")
    }

    // Implementación del metodo funcion de la interfaz Musico
    override fun funcion() {
        println("Su funcion es ser pianista")
    }

    // Implementación del metodo tocarPiano de la interfaz Piano
    override fun tocarPiano() {
        println("Su forma de tocar el piano cautiva a la gente")
    }

}