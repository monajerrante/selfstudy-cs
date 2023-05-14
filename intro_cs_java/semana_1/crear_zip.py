#!/usr/bin/env python3

import sys
import zipfile
import os


def create_zip_archive(archive_name, dir_name):
    """
    Crear un nuevo archivo Zip

    Para crear un nuevo archivo, hay que usar una
    instancia de ZipFile en modo de escritura "w"
    y para agregar archivos, use el método write().

    De forma predeterminada, el contenido del archivo
    zip no está comprimido (Zipfile.ZIP_STORED).
    Para añadir compresión, se requiere usar el módulo zlib.
    """
    try:
        import zlib
        compression = zipfile.ZIP_DEFLATED
    except:
        compression = zipfile.ZIP_STORED
        
    zf = zipfile.ZipFile(archive_name, mode="w")
    
    try:
        contenido = os.listdir(dir_name)
        for fichero in contenido:
            if fichero.endswith('.java'):
                zf.write(("./"+dir_name +"/"+fichero), compress_type=compression)
    finally:
        zf.close()
        

def getinfo_zip(archive_name):
    """
    Obtener la información del archivo zip
    
    1. Comprobar si es un archivo zip válido
       La función `` is_zipfile () `` devuelve un valor
       booleano (verdadero o falso) que indica si el archivo
       es un archivo ZIP válido (basado en su número magico ).

       zipfile.is_zipfile(archive_name)

    2. Leer los nombres de los archivos en un archivo ZIP
       Para leer los nombres de los archivos que estan
       dentro de un archivo zip existente, hay que usar
       namelist() de esta manera:

            zf = zipfile.ZipFile("example.zip", "r")
            print(zf.namelist)
            zf.close()
        
       El valor devuelto es una lista con los nombres
       del contenido del archivo zip.

    3. Lectura de los metadatos de un archivo ZIP
       Para acceder a todos los metadatos sobre el contenido ZIP,
       utilice el comando infolist() y el método getinfo().

            zf = zipfile.ZipFile("example.zip", "r")            
    """
    if not zipfile.is_zipfile(archive_name):
        return False
    
    zf = zipfile.ZipFile(archive_name, "r")
    #xx = zipfile.ZipFile(
    print(zf.namelist()) 
    zf.close()
    return True
    
    
if __name__ == "__main__":
    if len(sys.argv) == 1:
        print('Usa : {} archivo.zip dir_name'.format(sys.argv[0]))
        sys.exit(1)
    
    create_zip_archive(sys.argv[1], sys.argv[2])
    
    info = getinfo_zip(sys.argv[1])
    
    if not info:
        print("Algo salió mal")
        sys.exit(2)
    else:
        print("Todo parece haber ido bien")
