#!/usr/bin/env python3

# factorize.py
# La programa calcula y imprime todos los factores primos.

n = int(input())

factorize = [1,]
k = 2

while (n / 2) > k :
    while n % k == 0:
        factorize.append(k)
        n = n // k
    k += 1
if n > 1: factorize.append(n)

print(*factorize)

"""
/**********************************************************************
 ** Original de libro "CS: An Interdisciplinary Approach"
 ** Listado 1.3.9. Descompricion de numeros enternos en factores primos.
 **
 ** Factores.java
 **********************************************************************/
 
public class Factores {
    public static void main(String[] args) {
    // Imprimir descompricion N en factores primos
    long n = Long.parseLong( args[0] );

    for ( long factor = 2; factor <= n / factor; factor++) {
         // Comprobacion del multiplicador de potencial.
         while ( n % factor == 0) {
             // Exclusion y imprimir multiplicador $factor
             n /= factor;
             System.out.print( factor + " ");
             }  // Cualquier multiplicador $n debe ser grande que $factor
    }
    if (n > 1) System.out.print( n );
    System.out.println();
    }
}
"""

