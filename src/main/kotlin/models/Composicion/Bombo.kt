package antoine.lopez.models.Composicion

// Interface Bombo que extiende de Rol y define las funciones específicas de un percusionista que toca el bombo
interface Bombo: Rol {

    // Sobrescribe el metodo funcion de la interfaz Rol
    override fun funcion()

    // Define el metodo tocarBombo específico para esta interfaz
    fun tocarBombo()
}