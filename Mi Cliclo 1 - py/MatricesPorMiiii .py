import random
import math
import numpy as np
import claseMatriz
from claseMatriz import matriz
print("----------------------------------------"
"\n"
"\n"
"\n"
"\n"
"\n"
"\n"
)

m = int(input('Ingrese el numero de Filas: '))
n = int(input('Ingrese el numero de columnas: '))
'''
mpm = matriz(m,n)# definir la matriz 
mpm.imprimeMatrizPorFilas('Mi Mejor Matriz') # como Sting cambiaremos el nombre de la matriz
mpm.llenarMatrizAleatoriamente(100) # se llena la MATRIZ con enteros aleatorios del 0 al 100
mpm.imprimeMatrizPorColumnas()
mpm.intercambiarFilas(1, 2)

mpm.imprimeMatrizPorFilas()

mpm.intercambiarColumnas(2, 3)

mpm.imprimeMatrizPorFilas()


vsum = mpm.sumarFilas() # Suma filas de una matriz
vsum.imprimeVector()

vsum2 = mpm.sumarColumnas() # suma columnas de una matriz
vsum2.imprimeVector()


vtr = mpm.traspuesta()      #Transpuesta de la matriz mpm
vtr.imprimeMatrizPorFilas() 

vtr = vtr.traspuesta()       # TRANSPUESTA DE LA TRANSPUESTA 
vtr.imprimeMatrizPorFilas()
'''
print("------------------------------------------")
#----------------- COMO SUMAR DOS MATRICES --------------

m1 = matriz(m, n) # Definimos matriz 1 
m2 = matriz(m, n) # Definimos la matriz 2

m1.llenarMatrizAleatoriamente(10) # Rellenamos las dos matrices 
m2.llenarMatrizAleatoriamente(10) # con numeros aleatorios del 1 al 10

m1.imprimeMatrizPorFilas() # como Sting cambiaremos el nombre de la matriz
m2.imprimeMatrizPorFilas() # como Sting cambiaremos el nombre de la matriz

m3 = m1 + m2
m3.imprimeMatrizPorFilas()

print(m3)
print("------------------------------------------")
# ----------------- -> Multiplicar Matrices <- ---------------
m1 = matriz(4, 2) # Definimos matrices, el numero de columnas de la matriz 1
m2 = matriz(2, 4) # debe de ser igual al numero de filas de la matriz 2

m1.llenarMatrizAleatoriamente(10)
m2.llenarMatrizAleatoriamente(10)

m1.imprimeMatrizPorFilas('Mi matriz 1 ') # como Sting cambiaremos el nombre de la matriz 
m2.imprimeMatrizPorFilas('Mi Matriz 2 ') # como Sting cambiaremos el nombre de la matriz

m4 = m1*m2
m4.imprimeMatrizPorFilas( 'm1 * m2 ' )

#matriz por un escalar 
m3 = m1 * 4
m3.imprimeMatrizPorFilas('Mi Matriz 1 * 4')

print("------------------------------------------")
# -------------Suma Tringular Inferior --------------

mti = matriz(m,n) # Defenir matriz 

mti.llenarMatrizAleatoriamente(10) # Rellenar matriz del 0 al 10
mti.imprimeMatrizPorFilas('Trinagular inferior sin sumar')
print('\n\nSuma matriz Triangular INFERIOR: ',mti.sumaTriangularInferior())
print('Suma Triangular estricamente Inferior: ',mti.sumaTriangularEstrictamenteInferior())
print('Suma Diagonal PRIMARIA: ',mti.sumaDiagonalPrincipal())

#Suma Triangular SUPERIOR
print('\n\nSuma matriz Triangular SUPERIOIR: ',mti.sumaTriangularSuperior())
print('Suma Triangular estricamente Superior: ',mti.sumaTriangularEstrictamenteSuperior())
print('Suma diagonal Secundaria: ', mti.sumaDiagonalSecundaria(),'\n')

print("------------------------------------------")

# ------------------- ->Ver Posiciones de la MATRIZ <- ---------------------
miMA = matriz(m,n) # definimos la matriz
miMA.llenarMatrizAleatoriamente(20) # rellenamos la matriz aleatoriamente
miMA.imprimeMatrizPorFilas('-> MiMA <-')
print('\n\nMatriz en fila 2 columna 2 : ',miMA[2][2]) #Obtener posicion
print('Fila 3 de la matriz: ',miMA[3],'\n\n') # Obtener Fila de la Matriz



