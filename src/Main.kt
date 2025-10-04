




fun main() {
    println("=== ДЕМОНСТРАЦИЯ ФИГУР ===\n")

    // Создаем фигуры
    val rect = Rect(10, 10, 6, 4)
    val circle = Circle(15, 15, 3)
    val square = Square(20, 20, 5)

    println("1. СОЗДАЛИ ФИГУРЫ:")
    println("   $rect")
    println("   $circle")
    println("   $square")

    println("\n2. ПЕРЕМЕСТИЛИ НА (5,5):")
    rect.move(5, 5)
    circle.move(5, 5)
    square.move(5, 5)
    println("   $rect")
    println("   $circle")
    println("   $square")

    println("\n3. УВЕЛИЧИЛИ В 2 РАЗА:")
    rect.resize(2)
    circle.resize(2)
    square.resize(2)
    println("   $rect")
    println("   $circle")
    println("   $square")

    println("\n4. ПОВЕРНУЛИ ВОКРУГ (10,10):")
    println("   До поворота: $rect")
    rect.rotate(RotateDirection.Clockwise, 10, 10)
    println("   После поворота: $rect")

    println("\n   До поворота: $square")
    square.rotate(RotateDirection.CounterClockwise, 10, 10)
    println("   После поворота: $square")

    println("\n5. ПЛОЩАДИ ФИГУР:")
    println("   Площадь прямоугольника: ${rect.area()}")
    println("   Площадь круга: ${"%.2f".format(circle.area())}")
    println("   Площадь квадрата: ${square.area()}")
}