# Entonces parece que todo funciona bien. Continuamos.
# Intentaré implementar un juego completo.
board = [
         [' ', ' ', ' ',],
         [' ', ' ', ' ',],
         [' ', ' ', ' ',],
        ]

GAME_CONTINUE = 0
GAME_OVER     = 1

USER_WIN      = False
COMP_WIN      = False


def print_board(board):
    for i in board:
        for j in i:
            print(j, end=" ")
        print()
        

# definir una función que capture mi selección
def set_user_selection(coord: tuple):
    # aquí podría usar una excepción, pero por qué,
    # si puedo usar una construcción más común
    #(una construcción que está en todos los idiomas que conozco)
    if ((0 > coord[0]) and (coord[0] > 2)) \
        and ((0 > coord[1]) and (coord[1] > 2)):
        return -1
    
    # compruebo si ya instalado X o O
    if board[coord[0]][coord[1]] != ' ': 
        return 0  # ¡Ya instalado! No hizo el trabajo
    
    # parece que puedo llevar a cabo (continuar)
    board[coord[0]][coord[1]] = 'X'
    return 1  # ¡Te felicito! Encantado de trabajo contigo. Me alegro.


def set_comp_selection( board ):
    # en esta etapa no implementaré IA, porque no sé cómo
    # simplemente simulando este tipo de trabajo
    
    # comprobaré si hay un punto vacío en el tablero
    # en otras palabras, ¿está lleno el tablero?
    x = 0
    y = 0
    for x in range(len(board)):
        for y in range(len(board[0])):
            if board[x][y] == ' ':
                board[x][y] = 'O'
                return True
    
# ¿Demasiado código (letras) pero no tengo que pensar (no entiendo)?
# El comentario anterior se refiere a una función antigua.
def check_board(board):
    for i in range(len(board)):
        for j in range(len(board[0])):
            if board[i][j] == ' ':
                return GAME_CONTINUE
    return GAME_OVER
            

# Este código fue copiado de
#     https://inventwithpython.com/invent4thed/chapter10.html
# Porque mi función no funcionó.
def is_winner(board, le):
    return ( board[0][0] == le and board[0][1] == le and board[0][2] == le ) or \
           ( board[1][0] == le and board[1][1] == le and board[1][2] == le ) or \
           ( board[2][0] == le and board[2][1] == le and board[2][2] == le ) or \
           ( board[0][0] == le and board[1][0] == le and board[2][0] == le ) or \
           ( board[0][1] == le and board[1][1] == le and board[2][1] == le ) or \
           ( board[0][2] == le and board[1][2] == le and board[2][2] == le ) or \
           ( board[0][0] == le and board[1][1] == le and board[2][2] == le ) or \
           ( board[0][2] == le and board[1][1] == le and board[2][0] == le )

               
    

while check_board(board) == GAME_CONTINUE:
    print_board(board)
    coordenada = tuple(map(int, input("Ingrese tu elección (x, y) > ").split()))
    print("¡Vale!, eligiste el punto {} {}".format(coordenada[0], coordenada[1]))

    if set_user_selection(coordenada) != 1:
        continue
    if is_winner(board, 'X'):
        USER_WIN = True 
        break
          
    if check_board(board) == GAME_OVER :
        break
        
    set_comp_selection(board)
    if is_winner(board, 'O'):
        COMP_WIN = True
        break

print_board(board)
if check_board(board): print('Está bien, creo que tendremos una pelea mejor la próxima vez.')
elif USER_WIN: print("¡Te expreso mi respeto! ¡Eres el ganador!")
elif COMP_WIN: print("¡Jajaja! ¡Pobre hombrecito!")

        
print('SE JODA TODO')
