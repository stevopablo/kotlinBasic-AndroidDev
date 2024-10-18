enum class NivelDificuldade { BASICO, INTERMEDIARIO, DIFICIL }

class Aluno(val nome: String)

data class Curso(var nome: String, val duracao: Int = 60)

data class ProgramaFormacao(val nome: String, var cursos: List<Curso>, val nivel: NivelDificuldade) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
        //println("- Aluno: ${aluno.nome} matriculado")
    }
}

fun main() {
    val kotlinBasico = Curso("Kotlin Básico", 50)
    val kotlinAvancado = Curso("Kotlin Avançado", 50)

    val formacaoKotlin = ProgramaFormacao(
        "Formação Kotlin",
        listOf(kotlinBasico, kotlinAvancado),
        NivelDificuldade.INTERMEDIARIO
    )

    val aluno1 = Aluno("Pablo")
    val aluno2 = Aluno("Maria")
    val aluno3 = Aluno("Pedro")

    formacaoKotlin.matricular(aluno1)
    formacaoKotlin.matricular(aluno2)
    formacaoKotlin.matricular(aluno3)

    println("Formação: ${formacaoKotlin.nome}")
    println("Nível: ${formacaoKotlin.nivel}")
    println("Cursos:")
    formacaoKotlin.cursos.forEach { println("- ${it.nome} (${it.duracao} horas)") }


    println("Alunos matriculados:")
    formacaoKotlin.inscritos.forEach { println("- ${it.nome}") }
}
