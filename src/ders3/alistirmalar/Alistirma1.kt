package ders3.alistirmalar

fun main() {
    println("Adınızı giriniz:")
    val kullaniciAdi = readln()
    println("Boyunuzu giriniz:")
    val kullaniciBoyu = readln().toDouble()
    println("Kilonuzu giriniz:")
    val kullaniciKilosu = readln().toDouble()
    val boyMetre = kullaniciBoyu / 100

    val vucutKutle = kullaniciKilosu / (boyMetre * boyMetre)
    val formatliVKI = "%.2f".format(vucutKutle)

    println("Sayın $kullaniciAdi, Vücut Kitle İndeksiniz: $formatliVKI")
}