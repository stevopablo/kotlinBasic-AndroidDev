fun main() {
    var cargo: String = "presidente"
        when(cargo){
            "presidente" -> println(6000f)
            "gerente" -> println(4500f)
            "coordenador" -> println(3000f)
            "analista" -> println(2400f)
            "estagiario" -> println(1600f)
            else -> println("cargo não identificado")
        }

    var imc:Float = 41.1f
        when(imc){
            10f -> println("imc 10 ou abaixo")
            20f -> println("imc 20 ou maior que 11")
            30f -> println("imc esta 30 ou maior que 21")
            40f -> println("imc 40 ou maior que 31")
            else -> println("imc acima do normal")
        }
}