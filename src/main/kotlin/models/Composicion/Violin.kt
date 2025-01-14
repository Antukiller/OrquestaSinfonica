package antoine.lopez.models.Composicion

// Interface Violin que extiende de Rol y define las funciones específicas de un violinista
interface Violin: Rol {

    // Sobrescribe el metodo funcion de la interfaz Rol
    override fun funcion()

    // Define el metodo tocarViolin específico para esta interfaz
    fun tocarViolin()
}