fun main(){
    println("Bem vindo ao ByteBank")

    val funcionario = Funcionario(
        nome = "Marcelo Lima",
        salario = 10000.0,
        cpf = "111.222.333-00"
    )

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salário: ${funcionario.salario}")
    println("Bonificação: ${funcionario.bonificacao()}")
}


