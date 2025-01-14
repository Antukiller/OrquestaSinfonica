package antoine.lopez.models.Composicion

// Interface Trompeta que extiende de Rol y define las funciones específicas de un trompetista
interface Trompeta: Rol {

    // Sobrescribe el metodo funcion de la interfaz Rol
    override fun funcion()

    // Define el metodo tocarTrompeta específico para esta interfaz
    fun tocarTrompeta()
}