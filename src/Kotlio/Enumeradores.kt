enum class Prioridade(){
    baixa,media,alta
}
enum class Prioridade2(val v:Int){
    B(0),M(6),A(10)
}
enum class Animais(){
    gata,cachorro,tucano,papagaio,leao

}
enum class Prioridade3(val v: Int) {
    A(10) {
        override fun toString(): String {
            return "Prioridade Alta com valor $v"
        }
    },
    M(5) {
        override fun toString(): String {
            return "Prioridade média com valor $v"
        }
    },
    B(0) {
        override fun toString(): String {
            return "Prioridade baixa com valor $v"
        }
    }
}


fun x(p:Prioridade){

}
fun main() {
    x(Prioridade.alta)
    for(a in Prioridade.entries){
        println("$a ")
    }
    println()
    for(a in Animais.entries){
        println("$a ")
    }
    println()
    for(a in Prioridade2.entries){
        println("${a.v} ")
    }
}