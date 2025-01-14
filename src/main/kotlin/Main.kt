package antoine.lopez

import antoine.lopez.models.Composicion.*
import antoine.lopez.models.Herencia.*

fun main() {

    // Crear instancias de los diferentes músicos y el director
    val musico: Violin = Violinista("Jorge","Morgado", 19)
    val musico2: Piano = Pianista("Angel", "Sanchez", 19)
    val musico3: Trompeta = Trompetista("Rin", "Itochi", 26)
    val musico4: Bombo = Percusionista("Antu", "Lopez", 23)
    val director: Director = OrchestraConductor("Naruto", "Uzumaki", 40)

    // El director dirige la orquesta y realiza su función
    director.dirigir()
    director.funcion()

    println()
    // El Violinista toca el piano y realiza su función
    musico.tocarViolin()
    musico.funcion()

    println()
    // El pianista toca el piano y realiza su función
    musico2.tocarPiano()
    musico2.funcion()

    println()
    // El trompetista toca la trompeta y realiza su función
    musico3.tocarTrompeta()
    musico3.funcion()

    println()
    // El percusionista toca el bombo y realiza su función
    musico4.tocarBombo()
    musico4.funcion()

    println()
    // Verificar si el violinista también es director y, en ese caso, dirigir la orquesta
    if (musico is Director) {
        (musico as Director).dirigir()
    }

    println()
    // Verificar si el pianista también es director y, en ese caso, dirigir la orquesta
    if (musico2 is Director) {
        (musico2 as Director).dirigir()
    }

    println()
    // Verificar si el trompetista también es músico y, en ese caso, interpretar
    if (musico3 is Musico) {
        (musico3 as Musico).interpretar()
    }
}