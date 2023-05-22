'''
    Podemos dibujar cualquier forma usando la tortuga,
    como un rectángulo, un triángulo, un cuadrado y muchas más.
    Pero debemos tener cuidado con las coordenadas al dibujar
    el rectángulo porque los cuatro lados no son iguales.
    Una vez que dibujamos el rectángulo, incluso podemos intentar
    crear otros polígonos aumentando el número de lados.
'''

import turtle

tortuga = turtle.Turtle()

tortuga.goto(100, 1000) ## !!!! Ooops, la tortuga marcha afuera de pantalla
                        ## !!!! Vaya,  la tortuga se sale de la pantalla.

#  ++++++++++++++++++++++++ Empiezo de nuevo ++++++++++++++++++++++++++++++
tortuga.setpos(0, 0)
tortuga.forward(100) # t.goto(100, 0)
tortuga.goto(-50, 100)
tortuga.goto(100, 200)
tortuga.setpos(-100, 300)
tortuga.setposition(-150, 50)
tortuga.setpos(-50, -100)
tortuga.goto(0, 0)

turtle.mainloop()