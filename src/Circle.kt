


class Circle(var x: Int, var y: Int, var radius: Int) : Figure(0), Transforming, Movable {

    override fun area(): Float = (Math.PI * radius * radius).toFloat()

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {

        val dx = x - centerX
        val dy = y - centerY

        when (direction) {
            RotateDirection.Clockwise -> {
                x = centerX - dy
                y = centerY + dx
            }
            RotateDirection.CounterClockwise -> {
                x = centerX + dy
                y = centerY - dx
            }
        }
    }

    override fun toString(): String {
        return "Circle(center=($x,$y), radius=$radius, area=${"%.2f".format(area())})"
    }
}