class Gerente  {
    fun autenticar(senha: Int){
        if(senha == 123456){
            println("Acesso realizado com sucesso!")
        }
        println("Falha ao realizar autenticação!")
    }
}