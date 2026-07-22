package ders4

fun main() {
    println("Sepet tutarını giriniz: ")
    val tutar = readln().toIntOrNull()
    if (tutar == null) {
        println("Lütfen sayı girin!")
    } else if (tutar >= 500){
        println("Süper Fırsat! %20 İndirim Kazandınız")
    }else if (tutar >= 200) {
        println("Kargo Bedava!")
    }else
        println("İndirim için ürün eklemeye devam edin")
}