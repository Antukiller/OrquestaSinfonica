package antoine.lopez.models.Composicion

// Interface Piano que extiende de Rol y define las funciones específicas de un pianista
interface Piano: Rol {

    // Sobrescribe el metodo funcion de la interfaz Rol
    override fun funcion()

    // Define el metodo tocarPiano específico para esta interfaz
    fun tocarPiano()
}