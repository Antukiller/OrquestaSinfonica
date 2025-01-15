package antoine.lopez.models

class Pianista(): Musico, Piano {
    override fun interpretar() {
        println("El pianista interpreta una obra musical")
    }

    override fun tocarPiano() {
        println("EL pianista toca el piano")
    }

}