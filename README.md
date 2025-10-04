
# Figures Project

Проект демонстрирует работу с геометрическими фигурами в Kotlin, используя наследование и интерфейсы.

## Функциональность

### Реализованные классы:
- **Figure** - абстрактный базовый класс для всех фигур
- **Rect** - прямоугольник (наследует Figure, реализует Movable и Transforming)
- **Circle** - круг (наследует Figure, реализует Movable и Transforming)
- **Square** - квадрат (наследует Figure, реализует Movable и Transforming)

### Интерфейсы:
- **Movable** - обеспечивает перемещение фигур
- **Transforming** - обеспечивает масштабирование и вращение фигур

## Демонстрация работы
```
=== ДЕМОНСТРАЦИЯ ФИГУР ===

1. СОЗДАЛИ ФИГУРЫ:
   Rect(x=10, y=10, width=6, height=4, rotation=0°, area=24.0)
   Circle(center=(15,15), radius=3, area=28.27)
   Square(x=20, y=20, side=5, rotation=0°, area=25.0)

2. ПЕРЕМЕСТИЛИ НА (5,5):
   Rect(x=15, y=15, width=6, height=4, rotation=0°, area=24.0)
   Circle(center=(20,20), radius=3, area=28.27)
   Square(x=25, y=25, side=5, rotation=0°, area=25.0)

3. УВЕЛИЧИЛИ В 2 РАЗА:
   Rect(x=15, y=15, width=12, height=8, rotation=0°, area=96.0)
   Circle(center=(20,20), radius=6, area=113.10)
   Square(x=25, y=25, side=10, rotation=0°, area=100.0)

4. ПОВЕРНУЛИ ВОКРУГ (10,10):
   До поворота: Rect(x=15, y=15, width=12, height=8, rotation=0°, area=96.0)
   После поворота: Rect(x=5, y=15, width=8, height=12, rotation=90°, area=96.0)

   До поворота: Square(x=25, y=25, side=10, rotation=0°, area=100.0)
   После поворота: Square(x=25, y=-5, side=10, rotation=270°, area=100.0)

5. ПЛОЩАДИ ФИГУР:
   Площадь прямоугольника: 96.0
   Площадь круга: 113.10
   Площадь квадрата: 100.0
```
