
class Pessoa(val anoNascimento:Int, val nome:String){
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
    //var pessoa: String
    var pessoa: Pessoa = Pessoa(
            2000,
                        "Pablo")

    println(pessoa.nome)
    println(" voce tem ${pessoa.idade} anos")
    pessoa.saudacao()
    pessoa.acordar(true)


    println(pessoa.anoNascimento)
    if (pessoa.nome == "PABLO"){
        println("babadoi")
    }
}