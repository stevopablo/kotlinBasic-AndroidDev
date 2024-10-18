import java.sql.Array

fun primo(n:Int){
    if(n%2==0){
        println("O numero $n é primo")
    }else{
        println("O numero $n NÃO é primo")
    }
}
fun fibonacci(n: Int): List<Int> {
    val sequence = mutableListOf(0, 1)

    for (i in 2 until n) {
        val nextValue = sequence[i - 1] + sequence[i - 2]
        sequence.add(nextValue)
    }

    return sequence
}
fun horasParaHorasEMinutos(horas: Int) {
    val totalMinutos = horas * 60
    println("$horas horas é equivalente a $horas horas e 0 minutos, ou $totalMinutos minutos.")
}

fun minutosParaHorasEMinutos(minutos: Int) {
    val horas = minutos / 60
    val minutosRestantes = minutos % 60
    println("$minutos minutos é equivalente a $horas horas e $minutosRestantes minutos.")
}

fun procurar(pr: Int, lista: IntArray) {
    if (pr in lista) { // Verifica se o elemento 'pr' está contido na lista
        println("Elemento $pr encontrado na lista.")
    } else {
        println("Elemento $pr não existe na lista.")
    }
}


fun main() {
    val lista = IntArray(10)
    //val input = readLine()?.toInt()

    println("${lista.size}")
    var i = 0
    while(i != lista.size){
        println("digite um numero para add na posicao ${i +1}")
        lista[i] = readLine()?.toInt()?:0
        i++
    }
    println("Digite o número que deseja procurar:")
    val pr = readLine()?.toIntOrNull() ?: 0

    procurar(pr,lista)
    
}