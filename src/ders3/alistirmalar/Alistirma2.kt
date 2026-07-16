package ders3.alistirmalar

fun main() {
    println("Şehirinizi Giriniz: ")
    val sehir = readln()
    println("En düşük Sıcaklığı Giriniz: ")
    val dusukSicaklik = readln().toDouble()
    println("En yüksek Sıcaklığı Giriniz: ")
    val yuksekSicaklik = readln().toDouble()

    val ortalama = (dusukSicaklik + yuksekSicaklik) / 2.0

    println("Burası $sehir.Bugün sıcaklık $dusukSicaklik ile $yuksekSicaklik derece arasında değişecek." +
            "Ortalama sıcaklık ise $ortalama derece")

}