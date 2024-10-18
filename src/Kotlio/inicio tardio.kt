class Robo(){
    lateinit var nome:String
    fun ligar(){
        nome = "iniciando Robo..."
    }
    fun inicioTardio(){
        if (!this::nome.isInitialized){
            nome = "Incializanddo tardiamente..."
            println(nome)
        }
    }
}

fun main() {
    val bot:Robo = Robo()
    println(bot.ligar())
    bot.inicioTardio()
    println(bot.nome)
}