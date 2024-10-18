class obj(){
    fun amanhecer(h:Int){
        if (h <= 4 && h >=0){
            println("Madrugada")
        }else{
            println("Dia")
        }
    }
    fun acordar(h:Int){
        if (h == 0){
            println("dormindo")
        }else{
            println("acordado")
        }
    }
}
fun main() {
    var objt: obj= obj()
    objt.amanhecer(6)
    objt.acordar(2)

    with(objt){
        acordar(3)
        amanhecer(6)
    }
}