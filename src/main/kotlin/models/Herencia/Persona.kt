package antoine.lopez.models.Herencia

// // La clase abstracta Persona define una plantilla para personas con nombre, apellido y edad
abstract class Persona(
    val nombre: String,
    val apellido: String,
    val edad: Int
) {
    // Metodo abstracto que debe ser implementado por las clases hijas
    abstract fun ensayar()
}