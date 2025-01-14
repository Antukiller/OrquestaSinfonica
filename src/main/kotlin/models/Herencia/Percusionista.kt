package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Bombo
import antoine.lopez.models.Composicion.Musico

// La clase Percusionista hereda de Persona y además implementa las interfaces Musico y Bombo
class Percusionista(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Musico, Bombo {

    // Implementación del metodo ensayar de la interfaz Musico
    override fun ensayar() {
        println("El percusionista asiste al ensayo general")
    }

    // Implementación del metodo interpretar de la interfaz Musico
    override fun interpretar() {
        println("El percusionista ejecuta una obra musical para el publico")
    }

    // Implementación del metodo funcion de la interfaz Musico
    override fun funcion() {
        println("Su funcion es ser percusionista")
    }

    // Implementación del metodo tocarBombo de la interfaz Bombo
    override fun tocarBombo() {
        println("Su forma de tocar el piano irrita a la gente")
    }

}