'''
La pantalla se divide inicialmente en cuatro cuadrantes.
La tortuga se coloca al principio del programa es (0,0)
conocido como el Inicio.

    turtle.goto(x, y=None)
    turtle.setpos(x, y=None)
    turtle.setposition(x, y=None)

Este método se utiliza para mover la tortuga a otra área
de la pantalla. Toma las dos coordenadas - x e y.
'''
import turtle

tortuga = turtle.Turtle()

tortuga.goto(100, 100)
tortuga.goto(0, 0)

tortuga.setpos(-100, 100)
tortuga.setpos(0, 0)

tortuga.setposition(-100, -100)
tortuga.setposition(100, -100)
tortuga.setposition(0, 0)

turtle.mainloop()