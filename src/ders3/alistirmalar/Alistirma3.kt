package ders3.alistirmalar

fun main() {
    println("Toplam tutarı giriniz.")
    var tutar = readln().toDouble()

    val rastgeleSayi = (10..50).random()

    val indirim = tutar * rastgeleSayi /100.0

   tutar -= indirim
    println("Tebrikler! Çarktan %$indirim indirim kazandınız. Yeni ödeyeceğiniz tutar: $tutar TL.")

}