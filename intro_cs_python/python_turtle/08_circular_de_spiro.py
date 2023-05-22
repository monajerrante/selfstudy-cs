'''
Diseños atractivos utilizando Python Turtle Library

    Hemos aprendido conceptos básicos y avanzados de la biblioteca
    de tortugas de Python. Explicamos todas las características posibles
    de esta biblioteca. Al usar su función, podemos diseñar juegos,
    formas únicas y muchas cosas más. Aquí, mencionamos algunos diseños
    que usan la biblioteca de tortugas.

    Diseño - 1: Gráfico circular de Spiro      - 08_circular_de_spiro.py
    Diseño - 2: Círculo de vibración de Python - 09_circular_de_vibracion.py
'''
import turtle

# Creating turtle
t = turtle.Turtle()

turtle.bgcolor("black")
turtle.pensize(2)
turtle.speed(0)

while (True):
    for i in range(6):
        for colors in ["red", "blue", "magenta", "green", "yellow", "white"]:
            turtle.color(colors)
            turtle.circle(100)
            turtle.left(10)

turtle.mainloop()