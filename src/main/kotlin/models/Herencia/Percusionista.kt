package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Bombo
import antoine.lopez.models.Composicion.Musico

class Percusionista(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Musico, Bombo {
    override fun ensayar() {
        println("El percusionista asiste al ensayo general")
    }

    override fun interpretar() {
        println("El percusionista ejecuta una obra musical para el publico")
    }

    override fun funcion() {
        println("Su funcion es ser percusionista")
    }

    override fun tocarBombo() {
        println("Su forma de tocar el piano irrita a la gente")
    }

}