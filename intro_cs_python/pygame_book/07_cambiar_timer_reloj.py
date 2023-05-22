# En realidad, hay una mejor manera de lidiar con el parpadeo
# Hello World y pitido cada segundo para que no interfirió
# con la recuperación de eventos. La forma de hacer esto es agregar
# un reloj en lugar de un retraso, y solo emitir un pitido
# y parpadear cuando el reloj alcance la marca de 1 segundo
# en el reloj. La mejor manera de ilustrar el uso del reloj
# ver código:

import pygame
import sys

### Preparar las variables y otras
# inicializa el juego
pygame.init()

# crea la pantalla
screen = pygame.display.set_mode((320, 240))

WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)

HelloWorldColors = [BLACK, RED]

mouse_pos = None

# crea el objeto de fuentes
font = pygame.font.Font(None, 32)

time = pygame.time
count = 0
oneSecondMarkReached = False
lastTime = 0

while True:
    # incrementar el contador cada segundo
    if oneSecondMarkReached:
        count = count + 1

    screen.fill(WHITE)  # fondo de relleno

    # verificar el evento de salida
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
        elif event.type == pygame.MOUSEBUTTONDOWN:
            mouse_pos = pygame.mouse.get_pos()

    # crea una superficie de texto y una franja color,
    # usando RED rojo y BLACK negro
    text = font.render("Hello World", True,
                       HelloWorldColors[count % 2])

    # espera un segundo
    pygame.time.delay(1000)

    # Texto 3D con un borde rectangular negro
    pygame.draw.rect(screen, BLACK,
                     ((screen.get_width() - text.get_width()) / 2 - 10,
                      (screen.get_height() - text.get_height()) / 2 - 10,
                      text.get_width() + 20,
                      text.get_height() + 20), 1)

    # dibuja la imagen de la carita sonriente sobre el marco de 32x32
    if mouse_pos != None:
        screen.blit( pygame.image.load("./resource/cons-smile-2.png"),
                     (mouse_pos[0] - 16, mouse_pos[1] - 16)           )
    else:
        screen.blit( pygame.image.load("./resource/cons-smile-2.png"),
                ( screen.get_width()/2 - 16,
                 (screen.get_height() - text.get_height())/2 - 60
                )
            )

    # mover la superficie del texto al centro de la pantalla
    screen.blit(text, ((screen.get_width() - text.get_width()) / 2,
                       (screen.get_height() - text.get_height()) / 2))

    # actualiza el contenido de toda la pantalla.
    pygame.display.flip()

    # restablecer el indicador oneSecondMarkReached
    oneSecondMarkReached = False

    # informar al programa cada vez que marca de1 segundo
    currentTime = time.get_ticks()
    if currentTime - lastTime > 1000:
        lastTime = currentTime
        oneSecondMarkReached = True

##### -------+++++     FIN     +++++-------#####





