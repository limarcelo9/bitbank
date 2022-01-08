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

    for(i in 5 downTo 1 step 2){
        testarCondicoes(saldo, i)
    }

    var contaMarcelo = Conta()
    contaMarcelo.titular = "Marcelo Lima de Souza"
    contaMarcelo.conta = 1000
    contaMarcelo.saldo = 5000.00

    println(contaMarcelo.titular)
    println(contaMarcelo.conta)
    println(contaMarcelo.saldo)


}

fun testarCondicoes(saldo: Double, i: Int) {
    when {
        saldo > 0.0 -> println("conta é positiva $i")
        saldo == 0.0 -> println("conta é neutra $i")
        else -> println("conta é negativa $i")
    }
    println();
}