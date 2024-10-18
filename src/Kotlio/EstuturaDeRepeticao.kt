fun main() {
    for(i in 1..10)
        print(i)

    println(" ")
    println("downTo")
    for(i in 20 downTo 0 )
        print(i)

    println(" ")
    var txt:String = "descriao para funcao"

    for (i in txt){
        print("${i} ")
    }
    println(" ")
    for(i in 1..20 step 3)
        println("${i}")

    println(" ")
    for(i in 20 downTo 1 step 2)
        println("${i}")
}
