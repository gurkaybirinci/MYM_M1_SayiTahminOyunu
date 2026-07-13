package ders03_operatorler_string_sablonlari.alistirmalar

fun main() {
    // 1. Ejderha başlangıç canı (Double)
    var ejderhaCani = 1000.0

    // 2. Kullanıcı girdilerini topluyoruz
    print("Kahramanınızın adını giriniz: ")
    val kahramanAdi = readln()

    print("Kahramanınızın temel saldırı gücünü giriniz (Örn: 120.5): ")
    var saldiriGucu = readln().toDouble()

    // 3. Rastgele Kritik Hasar Bonusu üretiyoruz (10 ile 50 arası tam sayı)
    val kritikHasarBonusu = (10..50).random()

    // 4. += operatörü ile kritik hasarı temel hasara ekliyoruz
    saldiriGucu += kritikHasarBonusu

    // 5. -= operatörü ile toplam hasarı ejderhanın canından düşüyoruz
    ejderhaCani -= saldiriGucu

    // 6. Savaş Raporunu sadece temel String şablonları kullanarak yazdırıyoruz
    println("\n========= SAVAŞ RAPORU =========")
    println("Kahraman $kahramanAdi kılıcını çekti!")
    println("Kritik vuruş şansı tetiklendi! +$kritikHasarBonusu ek hasar eklendi.")
    println("Ejderhaya toplamda $saldiriGucu değerinde hasar verildi!")
    // Sadece virgülden sonra iki hane göstermek için formatlama yapıyoruz
    println("Ejderhanın kalan canı: ${"%.2f".format(ejderhaCani)}")
    println("================================")
}