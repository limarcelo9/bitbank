class Conta() {
    var titular = ""
    var conta = 0
    var saldo = 0.0
        private set

    fun depositar(valor: Double){
        if(valor > 0) {
            this.saldo += valor
        }

    }

    fun sacar(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if(this.saldo >= valor){
            this.saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false

    }
}