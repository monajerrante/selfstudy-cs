'''
Clonación de una tortuga

A veces, buscamos la tortuga múltiple para diseñar una forma única.
Proporciona la posibilidad de clonar la tortuga de trabajo actual
en el entorno y podemos mover ambas tortugas en la pantalla.
Entendamos el siguiente ejemplo.
'''
import turtle

t = turtle.Turtle()

c = t.clone()
t.color("blue")
c.color("red")
t.circle(20)
c.circle(30)
for i in range(40, 100, 10):
    c.circle(i)

turtle.mainloop()