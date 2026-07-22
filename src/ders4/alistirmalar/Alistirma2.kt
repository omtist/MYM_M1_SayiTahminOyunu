package ders4.alistirmalar

fun main() {
    println("Lütfen notunuzu giriniz: ")
    val not = readln().toIntOrNull()
    if (not == null) {
        println("Lütfen notunuz sadece rakam kullanarak giriniz.")
    } else{
        if (not >= 85) {
            println("Takdir Belgesi!!")
        } else if (not >= 50){
            println("Tebrikler geçtiniz!")
        } else {
            println("Kaldınız.")
        }
        val durum = if (not >= 50) {
            println("Geçti")
        } else {
            println("Kaldı")
        }
    }

}