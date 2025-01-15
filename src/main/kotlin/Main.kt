package antoine.lopez

import antoine.lopez.models.*


fun main() {
    val percusionista = PercusionistaImpl()
    val violinista = ViolinistaImpl()
    val pianista = Pianista()
    val trompetista = TrompetistaImpl()

    val musico1 = MusicoImpl("Sergio", "Ramos", 33, percusionista)
    val musico2 = MusicoImpl("Angel", "Gold", 23, pianista)
    val musico3 = MusicoImpl("Martin", "Lozano", 45, violinista)
    val musico4 = MusicoImpl("Elon", "Musk", 50, trompetista)

    if (musico1.rol is PercusionistaImpl) {
        (musico1.rol as PercusionistaImpl).tocarBombo()
    }

    musico1.rol = violinista
    if (musico1.rol is ViolinistaImpl) {
        (musico1.rol as ViolinistaImpl).tocarViolin()
    }

    println()
    if (musico2.rol is Pianista) {
        (musico2.rol as Pianista).tocarPiano()
    }

    musico2.rol = trompetista
    if (musico2.rol is TrompetistaImpl) {
        (musico2.rol as TrompetistaImpl).tocarTrompeta()
    }

    println()
    if (musico3.rol is ViolinistaImpl) {
        (musico3.rol as ViolinistaImpl).tocarViolin()
    }

    musico3.rol = pianista
    if (musico3.rol is Pianista) {
        (musico3.rol as Pianista).tocarPiano()
    }

    println()
    if (musico4.rol is TrompetistaImpl) {
        (musico4.rol as TrompetistaImpl).tocarTrompeta()
    }

    musico4.rol = percusionista
    if (musico4.rol is PercusionistaImpl) {
        (musico4.rol as PercusionistaImpl).tocarBombo()
    }




}