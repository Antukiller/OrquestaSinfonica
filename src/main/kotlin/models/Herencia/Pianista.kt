package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Director
import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Piano

class Pianista(
    nombre: String,
    apellido: String,
    edad: Int,
): Persona(nombre, apellido, edad), Musico, Piano, Director {
    override fun ensayar() {
        println("El pianista asiste al ensayo general")
    }

    override fun interpretar() {
        println("El pianista ejecuta una obra musical para el publico")
    }

    override fun dirigir() {
        println("El pianista dirige a la orquesta")
    }

    override fun funcion() {
        println("Su funcion es ser pianista")
    }

    override fun tocarPiano() {
        println("Su forma de tocar el piano cautiva a la gente")
    }

}