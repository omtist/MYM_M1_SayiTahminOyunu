package ders4.alistirmalar

fun main() {
    println("Lütfen yaşınızı girin: ")
    val yas = readln().toIntOrNull()
    val egitim = true
    if (yas != null) {
        if (yas >= 18) {
            println("İşlemlere başlayabilirsiniz.")
        } else {
            println("Ehliyet almak için yaşınız yeterli değil")
        }
        val onay = if (yas >= 18 && egitim){
            println("onay")
        } else {
            println("red")
        }
    } else {
        println("Lütfen sadece rakam giriniz.")
    }

}