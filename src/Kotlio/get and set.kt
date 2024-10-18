// function SET = Atribui um valor
// function GET = retorna o valor
// fuunction FIELD = evite chamada infinitas

class Planeta(var nome:String){
    private var id = 1
    var tamanho = 1000
    var fala = "terra"

        get(){
            println("Acessando GET")
            return field
        }
        set(value){
            println("acessando SET")
            field = value
        }
}
class Planeta2(){
    var nome:String = ""
        get(){
            println("Meu valor é $field")
            return field
        }
        set(value){
            if(value == ""){
                println("Planeta sem nome...")
            }else{
                field = value
            }
        }

}
fun main() {
    var p: Planeta = Planeta("Terra")
    println("tamnho ${p.tamanho}")

    var a:Planeta = Planeta("Marte")
    a.fala
    a.fala = "novo planeta > mARTE"
    a.fala
    a.fala = "babadoi"
    println("==============")
    println("planeta 2")

    var p2:Planeta2 = Planeta2()
    p2.nome = ""
    println("nome: ${p2.nome}")
    p2.nome = "Venus"
    println("nome: ${p2.nome}")

}