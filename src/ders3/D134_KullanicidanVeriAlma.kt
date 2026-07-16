package ders3

fun main() {
    println("Adını gir:")
    val isim = readln()

    println("Kilosunu gir: ")
    val dunyaKilosu = readln().toDouble()

    println("Adınız: $isim Kilonuz: $dunyaKilosu kg")

    val marsKilosu = dunyaKilosu + 0.38
    println("Marstaki kilonuz: $marsKilosu")

    val formatliMarsKilosu = "%.2f".format(marsKilosu)

    println("Merhaba $isim! Dünya’da $dunyaKilosu kg gelirken, Mars’ta sadece $formatliMarsKilosu kg gelirdiniz!")
}
