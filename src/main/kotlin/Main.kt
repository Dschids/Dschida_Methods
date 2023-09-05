import kotlin.math.pow
fun menu(): Int{
    println("Choose the number of shape who's area you would like to calculate")
    println("1) Square")
    println("2) Rectangle")
    println("3) Triangle")
    println("4) Circle")
    println("5) Quit")
    return readln()!!.toInt()
}

fun areaSquare(): Double{
    print("Enter the length: ")
    var length = readln().toDouble()
    var area = length.pow(2)


}

fun main(args: Array<String>) {

}