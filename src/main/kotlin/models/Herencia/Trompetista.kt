package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Musico
import antoine.lopez.models.Composicion.Trompeta

class Trompetista(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Musico, Trompeta {
    override fun ensayar() {
        println("El trompetista asiste al ensayo general")
    }

    override fun interpretar() {
        println("El trompetista ejecuta una obra musical para el publico")
    }

    override fun funcion() {
        println("Su funcion es ser trompetista")
    }

    override fun tocarTrompeta() {
        println("Su forma de tocar el piano cautiva a la gente")
    }

}