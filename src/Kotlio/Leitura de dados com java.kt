import java.util.Scanner

fun ler_Int(){
    val scanner = Scanner(System.`in`)  // Use backticks around 'in'
    println("digite um numero inteiro :")
    val num = scanner.nextInt()
    println("voce digitou : $num")
    //scanner.close()
}
fun ler_Double(){
    val scanner = Scanner(System.`in`)  // Use backticks around 'in'
    println("digite um numero double :")
    val num = scanner.nextDouble()
    println("voce digitou : $num")
    //scanner.close()
}
fun ler_string(){
    val scanner = Scanner(System.`in`)  // Use backticks around 'in'
    println("digite um string :")
    val num = scanner.next()
    println("voce digitou : $num")
    //scanner.close()
}
fun ler_float(){
    val scanner = Scanner(System.`in`)  // Use backticks around 'in'
    println("digite um float :")
    val num = scanner.nextFloat()
    println("voce digitou : $num")
    //scanner.close()
}



fun main() {
     ler_Int()
      ler_Double()
       ler_string()
        ler_float()
         ler_boolean()
}

fun ler_boolean(){
    val scanner = Scanner(System.`in`)  // Use backticks around 'in'
    println("digite um boolean :")
    val num = scanner.nextBoolean()
    println("voce digitou : $num")
    scanner.close()
}