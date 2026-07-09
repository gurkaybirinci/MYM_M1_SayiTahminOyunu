package ders2.alistirmalar

fun main() {
    /*
    📱 Uygulama Kartı Oluşturma:
    Yeni bir uygulama geliştirdiğinizi düşünün.
    val anahtar kelimesini kullanarak uygulamanızın adını ve sürüm kodunu (örneğin 1.0) tanımlayın.
    Ardından, günlük aktif kullanıcı sayısını tutacak bir değişkeni var ile tanımlayın.
    Bu sayıyı kodun ilerleyen satırlarında artırın ve her artıştan
    sonra println ile güncel durumu konsola yazdırın.
     */

    val uygulamaAdi = "Notlarım"
    val surumKodu = "1.0"
    var aktifKullaniciSayisi = 250

    println("Uygulama adı: " + uygulamaAdi)
    println("Sürüm kodu: " + surumKodu)
    println("Aktif kullanıcı sayısı: " + aktifKullaniciSayisi)

    aktifKullaniciSayisi += 40
    println("Güncel Aktif kullanıcı sayısı: " + aktifKullaniciSayisi)

    aktifKullaniciSayisi -= 25
    println("Güncel Aktif kullanıcı sayısı: " + aktifKullaniciSayisi)


}
