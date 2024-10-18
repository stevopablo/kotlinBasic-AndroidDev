class Silvestre(var nome:String){
    var ataque:Int = 0
    constructor(nome:String, atac:Int): this(nome){
        this.ataque = atac
    }
    fun ap(){
        println("meu animal silvestre é $nome e seu ataque é: $ataque")
    }
}
fun main() {
   val s1 = Silvestre("Águia")
   val s2 = Silvestre("serpente",200)
    val s3 = Silvestre("hamster",2)
    s1.ap()
    s2.ap()
    s3.ap()
}