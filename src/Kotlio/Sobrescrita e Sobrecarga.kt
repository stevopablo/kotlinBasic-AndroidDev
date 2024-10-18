open class Eletronicos(var marca:String){

    private fun corrente(ativo:Boolean?=false){}
    fun ligar(){
        corrente(true) }

    fun desligar(){
        corrente(false) }
}

class PC(marca:String):Eletronico(marca){
    fun salvar(){}
    override fun desligar(){
        salvar()
        super.desligar()
    }
}

class SmartTv(marca:String):Eletronico(marca){
    override fun desligar() {
        super.desligar()
    }
    override fun ligar(){
        super.ligar()
    }
}
fun main() {
    val pc:PC = PC("dell")
    pc.ligar()
    pc.desligar()
}