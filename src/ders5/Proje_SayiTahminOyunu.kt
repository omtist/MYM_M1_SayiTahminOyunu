package ders5

import kotlin.random.Random

fun main() {
    val random = Random.nextInt(0,100)
    print(random)
    println()
    print("Bir sayi tahmin ediniz:")
    val tahmin = readln().toIntOrNull()
    if (tahmin == null) {
        println("Lütfen geçerli bir tam sayı giriniz.")
    } else
        if (tahmin >= 100 || tahmin < 0) {
            println("Lütfen 1 ile 100 arasında bir sayı girin.")
        }else{
            if (tahmin > random) {
                println("Daha küçük bir sayı girmeliydiniz.")
            } else if (tahmin < random) {
                println("Daha büyük bir sayı girmeliydiniz.")
            } else{
                println("Tebrikler!! \uD83C\uDF89\uD83C\uDF89")
                println("|----------------------|")
                println("KAZANDINIZ")
                println("|----------------------|")

            }
        }
}