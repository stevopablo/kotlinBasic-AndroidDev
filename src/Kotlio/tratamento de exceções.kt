import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro:")

    try {
        val num = scanner.nextInt()
        println("Você digitou: $num")
    } catch (e: Exception) {
        println("Ocorreu um erro: ${e.message}")
    } finally {
        println("Operação concluída.")
    }
}