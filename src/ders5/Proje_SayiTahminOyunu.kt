package ders05_proje_sayi_tahmin_oyunu

fun main() {
    print("Sayıyı tahmin et: ")
    val tahmin = readln().toIntOrNull()

    if (tahmin == null) {
        println("Lütfen geçerli bir tam sayı girin 😥")
    } else if (tahmin < 1 || tahmin > 100) {
        println("Lütfen 1 ile 100 arasında bir sayı girin 😞")
    } else {
        val hedefSayi = (1..100).random()
        val mesaj =
            if (hedefSayi > tahmin) {
                "Daha BÜYÜK bir sayı denemeliydin 🙄"
            } else if (hedefSayi < tahmin) {
                "Daha KÜÇÜK bir sayı denemeliydin 🫩"
            } else {
                "Tebrikler! Sayıyı buldun 😀"
            }
        println(mesaj)
    }
}