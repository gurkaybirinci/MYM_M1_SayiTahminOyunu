package ders03_operatorler_string_sablonlari.alistirmalar

fun main() {
    // 1. Sepet tutarını sonradan güncelleyeceğimiz için 'var' ile tanımlıyoruz
    print("Lütfen sepetinizdeki toplam tutarı giriniz (TL): ")
    var sepetTutari = readln().toDouble()

    // 2. 10 ile 50 arasında (sınırlar dahil) rastgele bir tam sayı üretiyoruz
    val indirimYuzdesi = (10..50).random()

    // 3. İndirim miktarını hesaplıyoruz
    val indirimTutari = sepetTutari * indirimYuzdesi / 100.0

    // 4. -= operatörünü kullanarak indirim tutarını ana sepet tutarından düşüyoruz
    sepetTutari -= indirimTutari

    // 5. Sonuçları ekrana yazdırıyoruz
    println("Tebrikler! Çarktan %$indirimYuzdesi indirim kazandınız. Yeni ödeyeceğiniz tutar: $sepetTutari TL.")
}