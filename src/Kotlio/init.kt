class Animal(var especie:String){
    var fala: String = ""
    init {
        fala = if(especie.lowercase() == "cachorro"){
            "auau"
        }else if (especie.lowercase()== "gato"){
            "meowmepw"
        }else{
            ""
    }}
    init {
        println(fala)
    }
    fun fala(){
        println(false)
    }
}

fun main() {
    var animal = Animal("cachorro")
    Animal("gato").fala()
}