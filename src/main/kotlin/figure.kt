abstract class figure() {
    abstract fun area(): Double
    abstract fun perimeter(): Double

}

class triangle(val name: String, val a: Double, val b: Double, val c: Double) : figure() {
    fun test(): String {
        if (a + b >= c && b + c >= a && a + c >= b) {
            return ""
        } else {
            return "ERROR! There is no such triangle \n"
        }
    }

    override fun toString(): String {
        return "Name: $name"
    }

    override fun area(): Double {
        val s: Double = perimeter() / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))

    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

class circle(val name: String, val radius: Double, val diameter: Double = radius * 2) : figure() {
    override fun toString(): String {
        return "Name: $name"
    }

    override fun area(): Double {
        return Math.PI * (radius * radius)
    }

    override fun perimeter(): Double {
        return Math.PI * diameter
    }
}

class square(val name: String, val a: Double) : figure() {
    override fun toString(): String {
        return "Name: $name"
    }

    override fun area(): Double {
        return a * a
    }

    override fun perimeter(): Double {
        return a * 4
    }
}

fun main() {
    val triangle = triangle("Treagle", 7.0, 5.0, 7.0)
    println("Figure : ${triangle.name} ")
    print("${triangle.test()}")
    println("${triangle.name} area : ${triangle.area()} cm2")
    println("${triangle.name} perimeter : ${triangle.perimeter()} cm")
    val circle = circle("Circle", 5.0)
    println("Figure : ${circle.name}")
    println("${circle.name} area : ${circle.area()} cm2")
    println("${circle.name} perimeter : ${circle.perimeter()} cm")
    val square = square("Square", 6.0)
    println("Figure : ${square.name}")
    println("${square.name} area : ${square.area()} cm2")
    println("${square.name} perimeter : ${square.perimeter()} cm")
}