



class Square(var x: Int, var y: Int, var side: Int) : Figure(0), Transforming, Movable {
    private var rotation: Int = 0

    override fun area(): Float = (side * side).toFloat()

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        side *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY

        when (direction) {
            RotateDirection.Clockwise -> {
                x = centerX - dy
                y = centerY + dx
                rotation = (rotation + 1) % 4
            }
            RotateDirection.CounterClockwise -> {
                x = centerX + dy
                y = centerY - dx
                rotation = (rotation + 3) % 4
            }
        }
    }

    override fun toString(): String {
        return "Square(x=$x, y=$y, side=$side, rotation=${rotation*90}°, area=${area()})"
    }
}