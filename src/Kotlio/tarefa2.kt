import jdk.nashorn.internal.objects.NativeMath.min

class Carro(val consumo:Int, val cor:String, val tipo_motor:String, val marca:String, val km:Int){
    fun Economico(){
        if(consumo >= 15){
            println("$marca é economico, $consumo km")
        }else if(consumo < 15){
            println("$marca é de um consumo de alto padrão $consumo km")
        }
    }
}
fun main() {
    val corolla:Carro = Carro(7,"preto","flex","toyota",9222)
    val HB20:Carro = Carro(9,"branco","gasolina","hyundai",2000)
    val onix:Carro = Carro(16,"cinza","gasolina","chervolet",901233)

    val carros = listOf(corolla,HB20,onix)
    for (c in carros){
        c.Economico()
    }
    val menorConsumo = carros.minByOrNull { it.consumo }
    if(menorConsumo != null){
        println("carro com menor consumo é $menorConsumo")
    }else{
        println("nenhum carro economico")
    }


}