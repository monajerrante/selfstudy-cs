# Pregunta import ffmpeg
#### RESPUESTA
"""
    Las diferencias entre ambos formatos, es que uno es exclusivo
    de audio .mp3 y .mp4 puede contener audio, video e incluso otros datos
    como subtitulos, etc.

    Yo cuando he tenido que realizar esta operación utilizo la librería moviepy,
    puedes instalarla mediante el siguiente comando:

        pip install moviepy

    Una vez lo hemos instalado, podemos cargar un archivo .mp4 y depués guardarlo
    como .mp3
"""

import moviepy.editor as mp

name = "../resource/temp.mp4"

#Cargamos el fichero .mp4
clip = mp.VideoFileClip("../resource/temp.mp4")
#Lo escribimos como audio y `.mp3`
clip.audio.write_audiofile("../resource/temp.mp3")

"""
    Esta librería es de edición, así que tienes una gran cantidad de métodos
    para cambiar las características del audio, puedes ver aquí su documentación
    https://zulko.github.io/moviepy/
    
    En concreto a la hora de guardar el audio, puedes usar varios parámetros
    como la codificación, bitrate, etc. Esto se puede ver especificamente,
    en este apartado de la documentación 
    https://zulko.github.io/moviepy/ref/AudioClip.html
    
--->    bitrate
    Los audios no tienen obligatoriamente el por que tener un bitrate de 320kbps,
    de hecho varía de unos a otros. La mayoría de los audios descargados que han sido
    comprimidos en internet tienen un bitrate de 128kbps por segundo.
    Pero hay a personas que esa calidad les puede parecer inaceptable.

    Tu puedes guardarlo como quieras con el parámetro bitrate, tendrías que cambiar
    lo siguiente:

        clip.audio.write_audiofile("transformado_a.mp3", bitrate="320k")

--->    Advertencia
    A pesar de que su desarrollo y mantenimiento es bueno como se puede ver en
    pypi Las versiones de Python para las que está testado, la máxima es Python 3.6
    Aunque yo lo uso con Python 3.7 y funciona sin problemas.
"""

