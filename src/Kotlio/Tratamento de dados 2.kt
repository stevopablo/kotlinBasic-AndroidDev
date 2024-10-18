import java.lang.ArithmeticException
import kotlin.math.sqrt

fun main() {
    try {
        var str:String? = null
        str = "babadoi"
        println("tamanho da string ${str!!.length}")

        var a = 20/2
        println("resultado $a")

        var b = 4.0
        var c = sqrt(b)
        if (b < 0){
            throw  IllegalArgumentException()
        }
        var x = 2
        if(x == 1){
            throw  Exception()
        }
    }catch (e: NullPointerException){
        println("a variavel esta nulo")
    }catch (e:ArithmeticException){
        println("theres no division by 0")
    }catch (e:IllegalArgumentException){
        println("theres no sqrt of negative numbers")
    }catch (e:Exception){
        println("exeção geral")
    }
    finally {
        println("end...")
    }
}