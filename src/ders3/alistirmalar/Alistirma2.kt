package ders03_operatorler_string_sablonlari.alistirmalar

fun main() {
    // 1. Kullanıcı girdilerini topluyoruz
    print("Lütfen yaşadığınız şehri giriniz: ")
    val sehir = readln()

    print("Bugün beklenen en düşük sıcaklık değerini giriniz: ")
    val enDusuk = readln().toDouble()

    print("Bugün beklenen en yüksek sıcaklık değerini giriniz: ")
    val enYuksek = readln().toDouble()

    // 2. Aritmetik işlemleri gerçekleştiriyoruz
    val ortalama = (enDusuk + enYuksek) / 2.0

    // 3. String şablonu kullanarak anons metnini yazdırıyoruz
    // Şehir ismini tamamen büyük harfe çevirmek için .uppercase() kullanıyoruz
    println("Burası ${sehir.uppercase()}. Bugün sıcaklık $enDusuk ile $enYuksek derece arasında değişecek. Ortalama sıcaklık ise $ortalama derece.")
}