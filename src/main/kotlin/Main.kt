package antoine.lopez

import antoine.lopez.models.Composicion.*
import antoine.lopez.models.Herencia.*

fun main() {
    val musico: Violin = Violinista("Jorge","Morgado", 19)
    val musico2: Piano = Pianista("Angel", "Sanchez", 19)
    val musico3: Trompeta = Trompetista("Rin", "Itochi", 26)
    val musico4: Bombo = Percusionista("Antu", "Lopez", 23)
    val director: Director = OrchestraConductor("Naruto", "Uzumaki", 40)

    director.dirigir()
    director.funcion()

    println()
    musico2.tocarPiano()
    musico.funcion()

    println()
    musico2.tocarPiano()
    musico2.funcion()

    println()
    musico3.tocarTrompeta()
    musico3.funcion()

    println()
    musico4.tocarBombo()
    musico4.funcion()

    println()
    if (musico is Director) {
        (musico as Director).dirigir()
    }

    println()
    if (musico2 is Director) {
        (musico2 as Director).dirigir()
    }

    println()
    if (musico3 is Musico) {
        (musico3 as Musico).interpretar()
    }
}