fun vetor_inteiros(){
    var numbers = intArrayOf(1,2,4,5,6,6,3,1,3,14,13,12,3,)
    for(i in 0..numbers.size -1){
        print("${numbers[i]} ")
    }
    println("index 6: ${numbers[6]}")
    print("\n")

}



fun main() {
    vetor_inteiros()
}