#           0         1       2         3        4
lista = ['python' , "C#" , 'Java', ' Flask' , 'Rust']
lista2 = ['perro','gato','caballo']
listaNumeros = [3,5,33,565,4,3,565,7,7,878,6,5,4,76,7,1,324,0,987,6] 

lista.append('MongoDB')
lista.append('HTML5')
lista.append('CSS')
print('\n',lista)

print('\n',lista[1:4])

# Sublista del indice 0 al 6 en salto de 2 en 2
print('\n',lista[0:6:2])

lista.insert(3,'PyGames') #insentar elementos a la lista , los demas se corren a la derecha 
lista.insert(1,'C++')
print('\n',lista)

del lista[5]        #elimina valor del indice 5
print('\n',lista)
print("------------------------------------------")
lista.extend(lista2) #Agrega elemntos de una lista a otra lista 
print(lista)
print("------------------------------------------")
listaNumeros.sort() #los ordena en modo acendente 
print(listaNumeros)
print("------------------------------------------")

listaNumeros.sort(reverse=True) #Ordena la lista de forma descendente
print(listaNumeros)

print("------------------------------------------")

print(min(listaNumeros)) # saber numero menor de una lista
print(max(listaNumeros)) # saber numero mayor de una lista

print("------------------------------------------")

print(1 in listaNumeros)    # saber si un numero esta dentro de una lista (True/false) 
print(1000 in listaNumeros) # saber si un numero esta dentro de una lista (True/false) 

print(listaNumeros.index(7)) # saber el indice de un elemento

print(lista.clear()) #Elimina Todos Los elementos de una lista

