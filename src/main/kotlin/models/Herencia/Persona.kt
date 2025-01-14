package antoine.lopez.models.Herencia

abstract class Persona(
    val nombre: String,
    val apellido: String,
    val edad: Int
) {
    abstract fun ensayar()
}