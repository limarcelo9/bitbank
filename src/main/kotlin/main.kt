fun main(){
    println("Bem vindo ao ByteBank")

    val titular: String = "Marcelo"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100.0

    println("Titular $titular")
    println("Numero da conta $numeroConta")

    saldo += 200.0
    println("Saldo $saldo")

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}