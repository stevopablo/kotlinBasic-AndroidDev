import kotlin.concurrent.thread

fun main() {
    val s = readLine()
    var num = readLine()?.toInt()?:0
    var num2  = readlnOrNull()?.toInt()?: 0
    var num3  = readlnOrNull()?.toDouble()?: 0.0
    var num4  = readlnOrNull()?.toFloat()?: 0.0f
    var num5  = readlnOrNull()?.toBoolean()?: false

    println("Tipo string $s")
    println("Tipo int :$num")
    println("Tipo int :$num2")
    println("Tipo double: $num3")
    println("Tipo float :$num4")
    println("Tipo boolean :$num5")
}