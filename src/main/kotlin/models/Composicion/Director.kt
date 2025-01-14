package antoine.lopez.models.Composicion

// Interface Director que extiende de Rol y define las funciones específicas de un director de orquesta
interface Director: Rol {

    // Define el metodo dirigir específico para esta interfaz
    fun dirigir()
}