//open class Animal0(){
//    abstract fun emitirSom()
//    abstract fun comer()
//    abstract fun dormir()
//
//}
//class Dog:Animal0(){
//    override fun emitirSom() {
//        println("auaua")
//    }
//
//    override fun comer() {
//        println("comendo")
//    }
//
//    override fun dormir() {
//        println("dormindo")
//    }
//
//}
//class Cat:Animal0(){
//    override fun emitirSom() {
//        TODO("Not yet implemented")
//    }
//
//    override fun comer() {
//        TODO("Not yet implemented")
//    }
//
//    override fun dormir() {
//        TODO("Not yet implemented")
//    }
//
//}
//

interface dev{
    var salario:Float
    fun bonus():Float
}
class mobile(override var salario:Float):dev{
    override fun bonus(): Float {
        return salario*0.6f
    }

}
class game(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}

class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}
//sem polimorfismo  
//fun mostrar_bonus(m:mobile){
//    println(m.bonus())
//}
//fun mostrar_bonus(g:game){
//    println(g.bonus())
//}
//fun mostrar_bonus(b:back){
//    println(b.bonus())
//}

//com polimorfismo
fun mostrar_bonus(d:dev){
    println(d.bonus())
}
fun main() {
    mostrar_bonus(back(2000f))
    mostrar_bonus(game(1000f))
    mostrar_bonus(mobile(2000f))
}