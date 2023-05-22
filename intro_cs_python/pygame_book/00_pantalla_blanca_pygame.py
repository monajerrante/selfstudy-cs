import pygame
import sys

# Inicializa el juego
pygame.init()

# Crea la pantalla
gamewindow = pygame.display.set_mode((320, 240))

WHITE = (255, 255, 255)

while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
    gamewindow.fill(WHITE)
    # actualiza el contenido de toda la pantalla. Él usualmente
    # utilizado después de dibujar o mostrar la actualización
    # a asegúrese de que los cambios sean visibles. Esta función
    # también se conoce como "giro de pantalla" o "giro de página"
    # porque intercambia los búferes delantero y trasero que contienen
    # mostrar contenido.
    pygame.display.flip()