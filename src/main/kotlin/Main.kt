import kotlin.math.pow
// menu function produces a menu of 5 items and asks the user to choose one, function will continue to
// run until user makes a choice between 1 and 5
fun menu(): Int{
    var choice = 0
    while (choice !in 1..5) {
        println("Choose the number of shape who's area you would like to calculate")
        println("1) Square")
        println("2) Rectangle")
        println("3) Triangle")
        println("4) Circle")
        println("5) Quit")
        choice = readln()!!.toInt()
        if (choice !in 1..5){
            println("Invalid Selection!")
        }
    }
    return choice
}
// areaSquare calculates the area of a square by getting a length from the user and then squaring it
// before printing out the result
fun areaSquare(){
    print("Enter the length of the square: ")
    var length = readln().toDouble()
    var area = length.pow(2)
    println("The area of your square is " + "%.2f".format(area))
}
// areaRectangle function calculates the area of a rectangle by getting a height and width from the user
// and then multiplying together to get the area before printing out the result
fun areaRectangle(){
    println("Enter the width of the rectangle: ")
    var width = readln()!!.toDouble()
    println("Enter the height of the rectangle: ")
    var height = readln()!!.toDouble()
    var area = width * height
    println("The area of your square is " + "%.2f".format(area))
}
// areaTriangle calculates the area of a triangle by getting base and height from the user and then
// multiplying together then by .5 to get the area before printing out the result
fun areaTriangle(){
    println("Enter the base of the triangle: ")
    var base = readln()!!.toDouble()
    println("Enter the height of the triangle: ")
    var height = readln()!!.toDouble()
    var area = .5 * base * height
    println("The area of your square is " + "%.2f".format(area))
}
// areaCircle calculates the area of a circle by getting a radius from the user and then squaring it and
// multiplying by PI to get the area before printing out the result
fun areaCircle(){
    println("Enter the radius of the circle: ")
    var radius = readln()!!.toDouble()
    var area = 3.14 * radius.pow(2)
    println("The area of your square is " + "%.2f".format(area))
}
// main function initializes choice using the returned value from menu() then runs a while loop containing
// a when function with options for each choice 1-4, 5 ending the program. get a cont variable from user
// after the when loop to ask if user wants to keep calculating area, if yes sets choice equal to menu()
// and the loop repeats else sets choice to 5 ending the loop and program
fun main(args: Array<String>) {
    var choice = menu()
    while (choice != 5) {
        when (choice) {
            1 -> areaSquare()
            2 -> areaRectangle()
            3 -> areaTriangle()
            4 -> areaCircle()
        }
        println("Would you like to calculate the are of a different shape? y/n")
        var cont = readln()!!.toString().toLowerCase()
        if (cont == "y") {
            choice = menu()
        }
        else{
            choice = 5
        }
    }
}