'''
Personalización en una línea

Supongamos que queremos múltiples cambios dentro de la tortuga;
podemos hacerlo usando solo una línea. A continuación se presentan
algunas características de la tortuga.

    El color del bolígrafo debe ser rojo.
    El color de relleno debe ser naranja.
    El tamaño del bolígrafo debe ser 10.
    La velocidad del lápiz debe ser 7
    El color de fondo debe ser azul.
'''
import turtle

t = turtle.Turtle()

t.pencolor("red")      # El color del bolígrafo debe ser rojo.
t.fillcolor("orange")  # El color de relleno debe ser naranja.
t.pensize(10)          # El tamaño del bolígrafo debe ser 10.
t.speed(7)             # La velocidad del lápiz debe ser 7
# +++++++++++++++++++
t.begin_fill()         # El color de fondo debe ser azul.
t.circle(75)
turtle.bgcolor("blue")
t.end_fill()

turtle.mainloop()
