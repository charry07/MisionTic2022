from claseLSL import LSL
import random
"""
EJEMPLOS CON UNA LISTA SIMPLEMENTE LIGADA EN DESORDEN
"""

mi_LSL = LSL()

mi_LSL.insertarAlFinal(5) #Inserta al final de la lista Ligada
mi_LSL.imprimirLista()

mi_LSL.insertarAlFinal(25)
mi_LSL.imprimirLista()

mi_LSL.insertarAlFinal(1)
mi_LSL.imprimirLista()

mi_LSL.insertarOrdenado(12) # Inserta de forma Ordenada en la lista
print('La longitud es : ',mi_LSL.longitud(),'\n') # Cuantos Items Tiene La Lista
mi_LSL.imprimirLista()

mi_LSL.borrarDato(0) # Borra el dato (0) si lo encuentra
mi_LSL.imprimirLista()
mi_LSL.borrarDato(25)
mi_LSL.imprimirLista()

print('Posicion 2 en la lista Ligada es: ',mi_LSL[2],'\n') # Muestra El dato en alguna posicion [2]


mi_LSL.imprimirLista()

print("Llenamos la lista...")
for i in range(6): #Llenar Lista Aleatoria Con 6 intems del 1 al 100
    mi_LSL.insertarOrdenado(random.randint(1,100))
mi_LSL.imprimirLista()