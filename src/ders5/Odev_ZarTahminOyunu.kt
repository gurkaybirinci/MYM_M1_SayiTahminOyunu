package ders5

import kotlin.ranges.random
import kotlin.text.toIntOrNull

fun main() {
    print("1 ile 6 arasında bir zar tahmini girin: ")
    val tahmin = readln().toIntOrNull()

    if (tahmin == null) {
        println("Geçersiz giriş yaptınız, lütfen sadece rakam kullanın!")
    } else if (tahmin < 1 || tahmin > 6) {
        println("Zar sadece 1, 2, 3, 4, 5 veya 6 gelebilir!")
    } else {
        val zar = (1..6).random()
        println(zar)
        val mesaj =
            if (tahmin == zar) {
                "Tebrikler! Zar $zar geldi ve doğru bildiniz 😀"
            } else {
                "Maalesef bilemediniz. Zar $zar gelmişti 😥"
            }
        println(mesaj)
    }
}