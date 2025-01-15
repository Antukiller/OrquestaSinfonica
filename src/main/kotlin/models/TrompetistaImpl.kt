package antoine.lopez.models

class TrompetistaImpl(): Musico, Trompeta  {
    override fun interpretar() {
        println("El trompetista interpreta una obra musical")
    }

    override fun tocarTrompeta() {
        println("El trompetista toca la  trompeta")
    }


}