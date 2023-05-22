import pygame
import sys

# inicializa el juego
pygame.init()

# crea la pantalla
screen = pygame.display.set_mode((320, 240))

WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)

HelloWorldColors = [BLACK, RED]

# crea el objeto de fuentes
font = pygame.font.Font(None, 32)

count = 0
while True:
    count = count + 1
    screen.fill( WHITE )  # fondo de relleno

    # verificar el evento de salida
    for event in pygame.event.get():
        if event.type == pygame.QUIT :
            sys.exit()

    # crea una superficie de texto y una franja color,
    # usando RED rojo y BLACK negro
    text = font.render("Hello World", True,
                       HelloWorldColors[count % 2])

    # espera un segundo
    pygame.time.delay( 1000 )

    # Texto 3D con un borde rectangular negro
    pygame.draw.rect( screen, BLACK,
                      ( (screen.get_width() - text.get_width())/2 - 10,
                        (screen.get_height() - text.get_height())/2 - 10,
                      text.get_width() + 20,
                      text.get_height() + 20), 1 )

    # mover la superficie del texto al centro de la pantalla
    screen.blit(text, ((screen.get_width() - text.get_width()) / 2,
                       (screen.get_height() - text.get_height()) / 2))

    # actualiza el contenido de toda la pantalla.
    pygame.display.flip()