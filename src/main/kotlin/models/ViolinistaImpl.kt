package antoine.lopez.models

class ViolinistaImpl(): Musico, Violin {
    override fun interpretar() {
        println("El violinista interpreta una obra musical")
    }

    override fun tocarViolin() {
        println("El violinista tocaa el violin")
    }


}