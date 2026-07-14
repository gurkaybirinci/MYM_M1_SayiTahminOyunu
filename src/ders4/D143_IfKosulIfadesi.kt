package ders4

fun main() {
    print("Yaşını gir: ")
    val yas = readln().toIntOrNull()

    if (yas == null) {
        println("HATA: Lütfen sadece rakam kullanarak geçerli bir yaş girin!")
    } else if (yas < 18) {
        println("Reşit değilsiniz. İşleme devam edemezsiniz!")
    } else {
        println("Reşitsiniz. İşleme devam edebilirsiniz.")
    }

}