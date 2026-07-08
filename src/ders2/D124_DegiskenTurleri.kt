package ders2

fun main() {
    // String: Metinsel veri
    val urunAdi: String = "Organik Filtre Kahve"

    // Int: Adet belirten tam sayı
    val adet: Int = 3

    // Double: Kuruşlu olabilen fiyat bilgisi
    val birimFiyat: Double = 145.50

    // Boolean: Mantıksal durum (Stokta var mı, yok mu?)
    val stoktaVar: Boolean = true

    // Matematiksel işlem: Adet ile birim fiyatı çarpıyoruz
    val araToplam = adet * birimFiyat

    println("— SEPET DETAYI —")
    println("Seçilen Ürün: " + urunAdi)
    println("Sipariş: " + adet + " adet x " + birimFiyat + " TL")
    println("Ödenecek Tutar: " + araToplam + " TL")
    println("Gönderime Hazır Mı? (Stok Durumu): " + stoktaVar)
}