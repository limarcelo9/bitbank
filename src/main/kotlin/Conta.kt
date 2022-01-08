class Conta() {
    var titular: String = ""
    var conta: Int = 0
    var saldo: Double = 0.0

    fun depositar(valor: Double){
        this.saldo += valor
    }

}