package antoine.lopez.models

class MusicoImpl(nombre: String, apellido: String, edad: Int, var rol: Rol) : Musico, Persona(nombre, apellido, edad){
    override fun interpretar() {
        println("EL musico interpreta")
    }

    override fun ensayar() {
        println("El musico ensaya")
    }

}