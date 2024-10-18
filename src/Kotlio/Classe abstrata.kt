interface Selvagem {
    fun atacar()
}

interface Nadar {
    fun nada()
}

interface Voar {
    fun voa()
}

class Pato(val nome: String) : Voar, Nadar {
    override fun voa() {
        println("$nome está voando...")
    }

    override fun nada() {
        println("$nome está nadando")
    }
}

abstract class Mamifero(var nome: String) : Selvagem {
    abstract fun habitat()

    abstract fun acordar()

    abstract fun fala()

    abstract fun comer()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun acordar() {
        println("Cachorro está acordado")
    }

    override fun comer() {
        println("Cachorro come ração")
    }

    override fun fala() {
        println("Wof wof")
    }

    override fun habitat() {
        println("Casinha do cachorro")
    }

    override fun atacar() {
        println("Cachorro está atacando!")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun habitat() {
        println("Casinha do gato")
    }

    override fun acordar() {
        println("Gato está acordado")
    }

    override fun fala() {
        println("Mew mew")
    }

    override fun comer() {
        println("Gato come atum")
    }

    override fun atacar() {
        println("Gato está atacando!")
    }
}

fun main() {
    val cachorro = Cachorro("Cachorro")
    cachorro.comer()
    cachorro.fala()
    cachorro.acordar()
    cachorro.habitat()
    cachorro.atacar()

    val gato = Gato("Gato")
    gato.fala()
    gato.comer()
    gato.habitat()
    gato.acordar()
    gato.atacar()

    val pato = Pato("Pato")
    pato.nada()
    pato.voa()
}
