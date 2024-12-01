//"Recursividad"//

fun findMax(number: List<Int>): Int {
    tailrec fun findMaxHerper(index: Int, currentMax: Int): Int {
        if(index == number.size){
            return currentMax
        }
        val newMax = if(number[index]> currentMax) number[index] else currentMax
        return findMaxHerper(index + 1, newMax)
    }
    require(number.isNotEmpty()) {"La lista no pude estar vacia"}
    return findMaxHerper(0, number[0])
}

fun main(args: Array<String>) {
    val numbers = listOf(10, 15, 5, 4, 2, 1, 20, 58, 64, 150, 41, 250)
    println("El valor maximo en la lista es de: ${findMax(numbers)} ")
}