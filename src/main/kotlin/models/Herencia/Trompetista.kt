package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Trompeta

// La clase Trompetista hereda de la clase Persona y ademas implementa las interfaces Musico y Trompeta
class Trompetista(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Musico, Trompeta {

    // Implementacion del metodo ensayar de la interfaz Musico
    override fun ensayar() {
        println("El trompetista asiste al ensayo general")
    }

    // Implementacion del metodo interpretar de la interfaz Musico
    override fun interpretar() {
        println("El trompetista ejecuta una obra musical para el publico")
    }

    // Implementacion del metodo funcion de la interfaz Musico
    override fun funcion() {
        println("Su funcion es ser trompetista")
    }

    // Implementacio del metodo tocarTrompeta de la interfaz Trompeta
    override fun tocarTrompeta() {
        println("Su forma de tocar el piano cautiva a la gente")
    }

}