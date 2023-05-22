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
s = turtle.Screen()
s.bgcolor("black")
t.pencolor("red")

a = 0
b = 0
t.speed(0)
t.penup()
t.goto(0, 200)
t.pendown()
while (True):
    t.forward(a)
    t.right(b)
    a += 3
    b += 1
    if b == 210:
        break
    t.hideturtle()

turtle.mainloop()