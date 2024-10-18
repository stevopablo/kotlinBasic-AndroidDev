
class Pessoa_(val anoNascimento:Int, val nome:String){
    var idade = 2024 - anoNascimento
    fun saudacao(){
        println("Seja-bem vindo ${this.nome}")
    }

    fun acordar(x:Boolean = true){
        if(x == true){
            println("${this.nome} está acordado ")

        }else{
            println("${this.nome} está dormindo ")
        }
    }
}



fun main() {
    println("Digite o ano que você nasceu:")
    val anoNascimento = readlnOrNull()?.toIntOrNull() ?: 0  // Lê o ano de nascimento ou 0 se for inválido

    println("Digite seu nome completo:")
    val n = readLine()?:"desconhecido"  // Lê o nome completo

    println("Você está acordado? (sim/nao)")
    val acordado = readln()// Lê se a pessoa está acordada ou assume falso

    // Cria uma instância da classe Pessoa_
    val pessoa = Pessoa_(anoNascimento, n)

    // Exibe as informações da pessoa
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")

    if (acordado == "sim"){
        pessoa.acordar(true)
    }else if(acordado == "nao"){
        pessoa.acordar(false)
    }

    // Exibe o ano de nascimento
    println("Ano de nascimento: ${pessoa.anoNascimento}")

    // Verifica se o nome é "PABLO"
    if (pessoa.nome?.uppercase() == "PABLO") {
        println("Babadoi")
    }
}