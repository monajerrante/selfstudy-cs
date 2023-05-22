import pygame


def run_event_processing():
    """ Inicia un ciclo de eventos para verificar la entrada del usuario
    y los clics del mouse. Cuando el usuario hace clic en el tablero,
    maneja el evento de clic del mouse para X y establece el indicador
    X_placed en True, y también verifica si el usuario ha decidido abandonar
    el juego. El evento de salida se dispara cuando el usuario cierra la ventana.
    """
    global X_placed
    global game_over

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()  # sal de juego
            quit()
        if event.type == pygame.MOUSBUTTONDOWN:
            # pon X en tablera
            handle_mouse_down_for_x()
            X_placed = True


while True:
    if game_over:
        pygame.display.flip()
        pygame.time.delay(1000)
        draw_game_over_screen()
        check_for_quit_event()
    else:
        game_window.fill( WHITE )  # verifica el fondo blanco
        run_event_processing()     # para salir y hacer click
        game_over = check_for_win_or_draw() # compruebe si gana o empata
        draw_the_board()           # dibuja el campo de juego
        pygame.display.flip()      # actualizar pantalla

        # comprobar si alguien ganó después cómo se colocó X
        if game_over:
            continue

        # AI va aquí para poner O
        if X_placed:
            # Espera 1/2 segundo a que se vea como piensa la IA
            pygame.time.delay(500)
            O_placed = run_algorithm_to_place_O()
            game_over = check_if_anyone_won() # verificar si alguien ganó
            # Vuelva a dibujar el tablero para mostrar la letra O,
            # que acabamos de poner.
            draw_the_board()
            X_placed = False


    pygame.display.flip() # actualizar pantalla
    clock.tick(60)        # limitar el bucle a 60 fps