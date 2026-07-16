package ders3.alistirmalar

fun main() {
    var ejderhaCani = 1000.0

    println("Kahramının adını giriniz:")
    val kahramanAdi = readln()
    println("Kahramanın saldırı gücünü giriniz")
    var saldiriGucu = readln().toDouble()

    val rastgeleSayi = (10..50).random()
    saldiriGucu += rastgeleSayi

    ejderhaCani -= saldiriGucu

    val formatliCan = "%.2f".format(ejderhaCani)

    println("Kahraman $kahramanAdi, $rastgeleSayi kritik hasar bonusuyla $saldiriGucu ejderhaya hasar vermiştir!")
    println("Ejderhanın Kalan Canı $formatliCan")
}