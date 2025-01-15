package antoine.lopez.models

class PercusionistaImpl(): Musico, Percusionista {
    override fun interpretar() {
        println("El percusionista interpreta una obra musical ")
    }

    override fun tocarBombo() {
        println("El percusionista toca el bombo")
    }


}