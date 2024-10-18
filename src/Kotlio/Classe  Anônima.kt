import java.util.Objects

interface Evento {
    fun ok() {}
}

class Programa {
    fun Salvar(e: Evento) {
        println("Abrindo arquivos")
        println("Alterando arquivos")
        println("Salvando arquivo")
        e.ok()
    }
}

class Evento2 : Evento {
    override fun ok() {
        println("programa está salvo")
    }
}

fun main() {
    val programa: Programa = Programa()

    // Using Evento2
    val e: Evento2 = Evento2()
    programa.Salvar(e)

    // Using anonymous class
    programa.Salvar(object : Evento {
        override fun ok() {
            println("Salvando")
        }
    })
}
