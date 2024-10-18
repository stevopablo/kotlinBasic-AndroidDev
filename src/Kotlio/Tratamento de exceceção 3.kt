import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
    ler_arquivo()
}

fun ler_arquivo() {

    val arquivo = File("C:\\Learning Kotlin\\Conceitos_inicias\\src\\Kotlio\\step by step.txt")
    try {
        Scanner(arquivo).use { l ->
            while (l.hasNext()) {
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("falha ou ler o arquivo")
    }
}
