fun main() {
    var ret:Retangulo = Retangulo(10,20)
    var ret2:Retangulo = Retangulo(10,20)

    //Equals
    println(ret.equals(ret2))
    println("====================================")
    var ret3:RetanguloData = RetanguloData(10,20)
    var ret4:RetanguloData = RetanguloData(10,20)
    println(ret3.equals(ret4))

    var ret5:RetanguloData = RetanguloData(5,7)
    ret5 = ret4.copy()
    println(ret5.toString())

}


class Retangulo(var a:Int,var b:Int){
    override fun equals(other: Any?): Boolean {
        return if(other is Retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }

//    override fun hashCode(): Int {
//        return super.hashCode()
//    }
//
//    override fun toString(): String {
//        return super.toString()
//    }
}

data class RetanguloData(var a:Int,var b:Int){}


data class informacoes(val rua:String,val num:Int,val bairro:String,val cep:Int, val cidade:String){}

fun endereco(e:informacoes){

}