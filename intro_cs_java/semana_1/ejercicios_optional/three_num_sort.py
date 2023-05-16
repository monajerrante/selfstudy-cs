#!/usr/bin/env python3

''' Book: Computer Science:An Interdisciplinary Approach
    Capitulo 1.2. Built-in types of data.

   Exercise 1.2.34 Tres ordenados.
       Escribe un programa que toma la línea de comando
       de tres enteros argumentos y los imprime en orden
       ascendente.
   NOTA: Revisa la decisión en Java ThreeNumSort.java
'''
import sys

if len(sys.argv) == 4:
    try: 
        print(*sorted([int(i) for i in sys.argv[1:]])[::-1])
    except ValueError:
        print('Algo salió mal')
