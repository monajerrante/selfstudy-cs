# Dibujar un polígono en tortuga - Python

import turtle as turt

tr = turt.Turtle()

# Número total de lados del polígono a dibujar
side = int(input("El número de lados que debe tener el polígono es: "))

# Longitud total de cada lado del polígono a dibujar
lngth = int(input("La longitud de cada lado que debe tener el polígono es: "))

for j in range(side):
    tr.forward(lngth)
    tr.right(360 / side)

turt.mainloop()