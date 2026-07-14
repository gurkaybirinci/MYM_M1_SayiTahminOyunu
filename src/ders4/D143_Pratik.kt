package ders4

fun main() {
    print("Sepet tutarını girin: ")
    val tutar = readln().toDoubleOrNull()

    if (tutar == null) {
        println("Lütfen tutarı sayısal bir ifade olarak girin!")
    } else if (tutar >= 500) {
        println("Süper Fırsat! %20 İndirim Kazandınız!")
    } else if (tutar >= 200) {
        println("Kargo Bedava!")
    } else {
        println("İndirim için ürün eklemeye devam edin.")
    }


}