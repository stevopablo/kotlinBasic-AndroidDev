fun main() {
    val row = 3
    val column = 3
    val matrix: Array<Array<Int>> = Array(row) { Array(column) { 0 } } // Initialize with default value 0

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}
