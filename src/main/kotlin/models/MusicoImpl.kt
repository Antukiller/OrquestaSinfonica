package antoine.lopez.models

class MusicoImpl(nombre: String, apellido: String, edad: Int, var rol: Rol) : Musico, Persona(nombre, apellido, edad){
    override fun interpretar() {
        println("aaaa")
    }

    override fun ensayar() {
        println("bbbbbbb")
    }
}