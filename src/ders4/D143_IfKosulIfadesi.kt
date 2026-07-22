package ders4

fun main() {
    println("Yaşını gir: ")
    val yas = readln().toIntOrNull()
    println("Yaş: $yas")

    if (yas == null) {
        println("HATA!: Lütfen sadece rakam kullanarak geçerli bir yaş girin.")
    }else if (yas <= 18){
        println("Reşit değilsiniz.İşleme devam edemezsiniz.")
    } else {
        println("İşleme devam edebilirsiniz.")
    }
}