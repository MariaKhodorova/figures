



class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Figure(0), Transforming {
    private var rotation: Int = 0 // 0, 1, 2, 3 для 0°, 90°, 180°, 270°

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun area(): Float = (width * height).toFloat()

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        // Поворачиваем прямоугольник вокруг центра
        val dx = x - centerX
        val dy = y - centerY

        when (direction) {
            RotateDirection.Clockwise -> {
                // Поворот по часовой стрелке
                x = centerX - dy
                y = centerY + dx
                // Меняем ширину и высоту местами
                val temp = width
                width = height
                height = temp
                rotation = (rotation + 1) % 4
            }
            RotateDirection.CounterClockwise -> {
                // Поворот против часовой стрелки
                x = centerX + dy
                y = centerY - dx
                // Меняем ширину и высоту местами
                val temp = width
                width = height
                height = temp
                rotation = (rotation + 3) % 4
            }
        }
    }

    override fun toString(): String {
        return "Rect(x=$x, y=$y, width=$width, height=$height, rotation=${rotation*90}°, area=${area()})"
    }
}