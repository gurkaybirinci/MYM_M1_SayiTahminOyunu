package ders02_degiskenler.alistirmalar

fun main() {
    val urunAdi = "Süt"
    var adet = 3
    var birimFiyat = 42.75
    var stoktaVarMi = true

    val araToplam = adet * birimFiyat

    println("------ Market Bilgisi ------")
    println("Ürün Adı: "+ urunAdi)
    println("Adet: " + adet)
    println("Birim Fiyat: " + birimFiyat + " TL")
    println("Stokta Var mı: " + stoktaVarMi)
    println("Ara Toplam: %.2f TL".format(araToplam))
}