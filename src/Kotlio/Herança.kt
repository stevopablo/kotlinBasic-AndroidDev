open class Eletronico(marca:String){
  private  fun ativarCorrente(){}

    protected fun relogio(){
        println("função relogio")
    }

    open fun ligar(){
        println("Ligando...")
    }
    open fun desligar(){
        println("Desligando...")
    }
}

class Computatador(marca:String):Eletronico(marca){
    fun ConcluirInstalacao(){
        println("Instalando softwares")
        relogio()
    }
    fun Varredura(){
        println("Limpando")
    }
}

fun main() {
    var c:Computatador = Computatador("Samsung")
    c.ligar()
    c.ConcluirInstalacao()
    c.Varredura()
    c.desligar()
   // c.ativarCorrente()

}