package ders2.alistirmalar

fun main() {
    val uygulamaAdi = "Notlarım"
    val surumKodu = "1.0"

    var aktifKullanici = 250

    println("Uygulama adı: " + uygulamaAdi)
    println("Sürüm kodu: " + surumKodu)
    println("Aktif Kullanıcı Sayısı: " + aktifKullanici)

    aktifKullanici += 40
    println("Güncel Aktif Kullanıcı Sayısı: " + aktifKullanici)
    aktifKullanici -= 25
    println("Güncel Aktif Kullanıcı Sayısı: " + aktifKullanici)

}