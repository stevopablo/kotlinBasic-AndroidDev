fun main() {
    println("funcão let")
    var str:String? = null
    str = "pabl"
    if(str != null){
        println("caiu no if")
    }
    str?.let {
        println("caiu na funcao let")
    }
}