package ders03_operatorler_string_sablonlari.alistirmalar

fun main() {
    // 1. Kullanıcıdan gerekli bilgileri okuyoruz
    print("Lütfen adınızı giriniz: ")
    val isim = readln()

    print("Lütfen boyunuzu santimetre cinsinden giriniz (Örn: 175): ")
    // Boyu ondalıklı işlem yapabilmek için Double tipine dönüştürüyoruz
    val boyCm = readln().toDouble()

    print("Lütfen kilonuzu giriniz (Örn: 70.5): ")
    val kilo = readln().toDouble()

    // 2. VKİ hesaplama adımları
    // Formül gereği boyu metreye çeviriyoruz
    val boyMetre = boyCm / 100.0
    val vki = kilo / (boyMetre * boyMetre)

    // 3. Değeri virgülden sonra 2 basamak gösterecek şekilde formatlıyoruz
    val vkiFormatli = "%.2f".format(vki)

    // 4. Sonucu String şablonu ile ekrana yazdırıyoruz
    println("Sayın $isim, Vücut Kitle İndeksiniz: $vkiFormatli.")
}