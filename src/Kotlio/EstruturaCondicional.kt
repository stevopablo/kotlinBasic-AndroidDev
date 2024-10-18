fun main() {
    var idade: Int = 2

    if (idade>= 60){
        println("${idade} é idoso(a)")
    }else if (idade<=59 && idade>=21){
        println("${idade} é adulto(a)")
    }else if(idade >= 13 && idade <= 20){
        println("${idade} é jovem ")
    }else{
        println(" ${idade} menor de idade")
    }
}