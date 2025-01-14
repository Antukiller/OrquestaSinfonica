package antoine.lopez.models.Herencia

import antoine.lopez.models.Composicion.Director

/**
 * Clase que representa a un director de orquesta.
 *
 * @param nombre El nombre del director.
 * @param apellido EL apellido del director.
 * @parame edad La edad del director.
 */
class OrchestraConductor(
    nombre: String,
    apellido: String,
    edad: Int
): Persona(nombre, apellido, edad), Director {

    /**
     * Metodo que simula el ensayo del directo de orquesta
     * Imprime un mensaje indicando que el director ha asistido al ensayo genertal
     */
    override fun ensayar() {
        println("EL director ha asistido al ensayo general")
    }

    /**
     * Metodo que simula la accion de dirigir de un director de
     *
     */

    override fun dirigir() {
        println("El director dirige mucho a los musicos")
    }

    override fun funcion() {
        println("Su funcion es ser director")
    }

}