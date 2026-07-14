package ders4

fun main() {
    val sicaklik = 8

    val uyari =
        if (sicaklik < 10) {
            "Hava şoğuk. Mont giymenizi öneririm!"
        } else {
            "Hafif bir ceket yeterli olacaktır."
        }

    println("UYARI: $uyari")

}