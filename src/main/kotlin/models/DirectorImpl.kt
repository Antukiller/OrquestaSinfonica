package antoine.lopez.models

class DirectorImpl(nombre: String, apellido: String, edad: Int) : Director, Persona(nombre, apellido, edad) {
    override fun dirigir() {
        println("El director dirige")
    }

    override fun ensayar() {
        println("El director ensayan con la orquesta")
    }
}