// Task 5.2.1: main program
fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Radius required")
        return
    }

    val radius = args[0].toDoubleOrNull()

    if (radius == null || radius < 0) {
        println("Error: Invalid radius")
        return
    }

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Area = %.4f".format(area))
    println("Perimeter = %.4f".format(perimeter))
}