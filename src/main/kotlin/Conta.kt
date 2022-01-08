class Conta() {
    private var titular: String = ""
    private var conta: Int = 0
    private var saldo: Double = 0.0

    fun getTitular(): String {
        return this.titular
    }

    fun getConta(): Int {
        return this.conta
    }

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun setConta(conta: Int) {
        this.conta = conta
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

    fun depositar(valor: Double){
        this.saldo += valor
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