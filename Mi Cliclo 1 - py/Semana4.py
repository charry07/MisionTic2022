import math
print("----------------------------------------"
"\n"
"\n"
"\n"
"\n"
"\n"
"\n"
)
#CLASES
'''
class Usuario :
    def __init__(self,user = '',password = ''):
        self.password = 'password'
        self.user = 'user'    

user1 = Usuario('charry07','4nd3rs0n')
user2 = Usuario('super23','123456')
user3 = Usuario()

print(user1.__dict__)
print(user2.__dict__)
print(user3.__dict__)
'''
#Herencia en las clases
'''
class Animal:
    def comer (self):
        print('La Aniamal comee')
    def dormir (self):
        print('La Animal duerme ')

class AnimalDomestico(Animal) : #clase padre
    print('Son De LA CASA')
class AnimalSalvaje(Animal):
    print('Son Muy Feroses')

class Felino(AnimalSalvaje):
    def cazar(self):
        print('Son Sigilosos Y Veloces')



class Perro(AnimalDomestico): # clase hijo , es la que hereda todo de clase animal 
    pass
class Gato(Felino,AnimalDomestico):
    def __init__(self, nombre):
        self.nombre = nombre
        

milu = Perro()
pol = Gato('Pol')

milu.comer()
milu.dormir()
pol.comer()
pol.dormir()
pol.cazar()
'''
'''
from claseVector import vector
import random
n = int(input("Entre tamaño del vector: "))
vec = vector(n)
vec.V[0] = n // 2
for i in range(1, n // 2 + 1):
    vec.V[i] = random.randint(1, 100)
vec.imprimeVector("Vector de prueba creado")
vec.agregarDato(13)
vec.imprimeVector("Vector con dato agregado")
vec.seleccion()
vec.imprimeVector("Vector ordenado ascendentemente")
vec.buscarDondeInsertar(39)
vec.insertar(39, i)
vec.imprimeVector("Vector con dato 39 insertado")
vec.insertar(44)
vec.imprimeVector("Vector con dato 44 insertado")

V = [8, 3, 1, 6, 2, 7, 4, 9, 5]
for i in range(8, 1, -1):
        V[i] = V[(i-1)%8]
for i in range(1, 9):
        print(V[i], sep="", end=" ")

'''
# contruccion de una MATRIZ Aleatoria
import random

m = int(input('\n Entre el numero de filas de la matriz: '))
n = int(input('\n Entre el numero de columnas: '))
'''
mat = [] * (m+1)
for i in range(0,m+1,1):
    a = [0]*(n+1)
    mat.append(a)

for i in range(0,m+1):
    for j in range (0,n+1):
        mat[i][j]= random.randint(0,9)
for i in range(0,m+1):
    for j in range (0,n+1):
        print(mat[i][j], end = ',')

    print()
'''
class Matriz : # Constructor
    def __init__(self,m,n):
        self.m = m # Filas de la matriz
        self.n = n # Columnas de la matriz
        self.mat = [] * (m+1)
        for in range (1,m+1):
            a = [0]*(n+1)
            self.mat.append(a)
        

