'''Turtle can be moved in four directions.
Forward
Backward
Left
Right
'''
import turtle

t = turtle.Turtle()  #  Crea una tortuga (que marchará :)
t.forward(100)       #  ... y   marcha   adelante.
t.backward(100)      #  La tortuga marcha en dirección opuesta
# ++++++++++++++ ...¿ Y que ? ¡ Queremos más ! +++++++++++++++
t.forward(100)       #  ... y   marcha   adelante.
t.left(90)           #  La tortuga gira a la izquierda
t.right(90)          #  ¿Que? ¡Al diablo! , la tortuga gira a la derecha....
t.forward(100)       #  ... y marcha adelante. ¡Vamos!
t.right(90)          # ¡A la derecha!
t.forward(75)        # ¡Marcha!
# +++++++++++++ ... ¡Vale, Descansa!

# Para detener la pantalla para mostrar
turtle.mainloop()