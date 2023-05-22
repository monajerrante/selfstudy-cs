'''
Cambiar la dirección del lápiz

Por defecto, la tortuga apunta a la derecha de la pantalla.
A veces, necesitamos mover la tortuga al otro lado de la pantalla.
Para lograr esto, podemos usar el método penup().
La función pendown() se utiliza para empezar a dibujar de nuevo.
Considere el siguiente ejemplo.
'''
import turtle

# Creating turtle
t = turtle.Turtle()

t.fd(100)
t.rt(90)
t.penup()
t.fd(100)
t.rt(90)
t.pendown()
t.fd(100)
t.rt(90)
t.penup()
t.fd(100)
t.pendown()

turtle.mainloop()