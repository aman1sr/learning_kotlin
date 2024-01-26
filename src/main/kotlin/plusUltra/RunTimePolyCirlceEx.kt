package plusUltra

/*
* NOTE:  you cannot create instance of an Interface,
*       but,,,you create a reference to an interface and then assign it to an object of a class that implements the interface.
*
*
* */
fun main() {
    val circle = Circle(5.0)
    val square = Square(25.0)

    circle.radius = 24.0            // we can update this field because we haven't set it val, also, by marking it private it's scope becomes limited

    val circleCalculator = AreaCalculator(circle)
    val squareCalculator = AreaCalculator(square)

    circleCalculator.printArea()
    squareCalculator.printArea()

    val shape: Shape = Square(30.0)
    println("area = ${shape.calculateArea()}")

}
    interface Shape{
        fun calculateArea():Double
    }
    class Circle( var radius: Double): Shape {        // is there a reason to mark the parameter as private
        override fun calculateArea(): Double {
            return Math.PI*radius*radius
        }
        fun checkingCircle():Int{
            return 100
        }
    }
    class Square(val sideLength: Double): Shape {
        override fun calculateArea(): Double {
            return sideLength*sideLength
        }
    }

/*
   * the code AreaCalculator class demonstrates runtime polymorphism because it allows you to interchangeably
   * use different implementations of the Shape interface  without knowing their specific types at compile time
   * */
    class AreaCalculator(val shape: Shape){
        fun printArea(){
            println("Area: ${shape.calculateArea()}")
        }
    }

