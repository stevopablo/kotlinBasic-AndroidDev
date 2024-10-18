fun main() {
    //any
    //unit
    //nothing
    a(false)
    b()
}

fun a(valor:Any){
    println("valor = $valor")
}

fun b():Unit{
    println("função void")
}

fun c():Nothing{
     TODO ("Função para ser completada")
}