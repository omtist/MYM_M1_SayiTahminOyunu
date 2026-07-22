package ders4

fun main() {
    val sicaklik = 11;

    val uyari = if (sicaklik < 10){
        "Mont giyin,Hava buz gibi!"
    }else {
        "Hafif bir ceket yeterli olacaktır."
    }
    println("UYARI: $uyari")
}
