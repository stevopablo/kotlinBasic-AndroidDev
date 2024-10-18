fun main() {
    var str:String? = null
    str = "pablo"
    if(str == null){
        println("variavel nula")
    }else{
        println(str)
    }
    var n1:Int = 1
    var n2:Int = 2
    var s:Int = n1 + n2
    //OPERADOR ELVIS

    println(str?: "Nula")
    println(s?:"null")
}