fun testarCondicoes(saldo: Double, i: Int) {
    when {
        saldo > 0.0 -> println("conta é positiva $i")
        saldo == 0.0 -> println("conta é neutra $i")
        else -> println("conta é negativa $i")
    }
    println();
}