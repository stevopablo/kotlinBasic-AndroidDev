class Animal_0(
    val nome:String,
    //especiekkkkkkkkk
    val especie:String,
    val idade:Int,
    val som:String){

    fun descricao(){
        println("O nome do $especie é $nome e tem $idade anos e $som")
    }
    fun Comer(){
        println("$nome está comendo...")
    }

    fun Brincar(){
        println("$nome está brincando...")
    }

    fun Correr(){
        println("$nome foi correr...")
    }

    fun Dormir(){
        println("$nome está dormindo...")
    }
}

fun main() {
    val cachorro:Animal_0 =Animal_0("tito","cachorro",2,"auau")
    val gato:Animal_0 = Animal_0("Margarita","gato",4,"mewmew")
    val hasmter:Animal_0 = Animal_0("bart","hamster",1,"")
    val papagaio:Animal_0 = Animal_0("ze","papagaio",19,"")
    val leao:Animal_0 = Animal_0("oz","leao",6,"oww")
    val porco:Animal_0 = Animal_0("valentina","porco",1,"oinc oinc")
    val vaca:Animal_0 = Animal_0("Renata","vaca",3,"muuuuu")

    val animais = listOf(cachorro,gato,hasmter,papagaio,leao,porco,vaca)


    for (animal in animais){
        animal.descricao()
        animal.Comer()
        animal.Brincar()
        animal.Dormir()
        println("-----------------------------")
    }


}