fun main(args: Array<String>) {

    println("Selamat dataang di kalkulator")
    println("Masukkan Angka Pertama:")
    val a = readLine()!!.toDouble()
    println("Masukkan Angka Kedua:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Terima kasih telah menggunakan kalkulator.")
}