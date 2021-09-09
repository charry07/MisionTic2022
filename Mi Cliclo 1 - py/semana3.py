#Subprogramas, vectores y programación orientada a objetos
#Ejercicios con FUNCIONES
import math
from typing_extensions import Annotated
print("----------------------------------------"
"\n"
"\n"
"\n"
"\n"
"\n"
"\n"
)
"""
def esPar (x):
    if (x % 2 == 0 ):
        return True
    else:
        return False
print(esPar(8))
"""
#escalera con entrada
"""
altura = int(input("ingrese la altura de la piramide "))
for num in range ( 1 , altura + 1 , 1 ):
    for j in range ( 1 , num + 1 , 1):
        print (num , end = "")
    print("\n", end = "" );
# escalera con una funcion
def escalera(altura):
    for i in range(0, altura):
        for j in range(0, i+1):
            print(i, end="")
        print("")
escalera(5)
"""
#ejercicios de operacion aritmetica
"""
a = int(input(" a "))
b = int(input(" b "))
c = int(input(" c "))
"""
"""
res = ((a**3)*((b**2)-(2*a*c)))/(2*b)
print(res)
"""
"""
res = ((3+5*8) < 3 and (((-6/3)*4)+2<2)) or (a>b)
print(res)
"""
"""
totalC = float(input("Ingrese el Total de su compra para el 15% "))
descuento = totalC * 0.85
print("el precio final es de $",descuento)
"""
"""
num1 = int(input("Ingrese un numero "))
num2 = int(input("Ingrese un numero "))

if ( (num1 and num2) % 2 == 0 ):
    print(f" {num1} y {num2} son numeros PARES ")
elif ( num1 % 2 == 0 and num2 % 2 != 0 ):
    print(f"{num1} es PAR y {num2} No es PAR");
elif ( num2 % 2 == 0 and num1 % 2 != 0 ):
    print(f"{num2} es PAR y {num1} No es PAR");
else:
    print(f"{num1} y {num2} Son IMPARES ");
"""
# Hacer un programa que pida 3 numeros y determine cual es el mayor ----> 
"""
num1 = float(input("Ingrese un numero"))
num2 = float(input("Ingrese un numero"))
num3 = float(input("Ingrese un numero"))

if ( num1 > num2 > num3 ):
    print(f"{num1} es mayor que {num2} mayor que {num3} ");
elif ( num2 > num1 > num3 ):
    print(f"{num2} es mayor que {num1} mayor que {num3} ");
elif ( num2 > num3 > num1 ):
    print(f"{num2} es mayor que {num3} mayor que {num1} ");
elif ( num3 > num2 > num3 ):
    print(f"{num3} es mayor que {num2} mayor que {num1} ");
elif ( num3 > num1 > num2 ):
    print(f"{num3} es mayor que {num1} mayor que {num2} ");
elif ( num1 > num3 > num2 ):
    print(f"{num1} es mayor que {num3} mayor que {num2} ");
"""
#Hacer un programa que pida una letra y diaga si es vocal o consonante
"""
letra = str(input("Ingrese una letra ")).lower()
if (letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u" ):
    print("Es una vocal");
else:
    print("Es una consonante");
"""
#Hacer Un programa que simule el funionamito de una calculaora (suma , resta , multiplicacion y division)
"""
num1 = float(input("Numero "))
ope = str(input("Operacion ")).lower()
num2 = float(input("numero "))

if ( ope == "s" ):
    print("\n" "La suma es " , num1+num2)
elif ( ope == "r" ):
    print("\n" "La resta es " , num1-num2);
elif ( ope  == "p" or ope == "m" ):
    print("\n" "La Multiplicacion es " , num1*num2);
elif ( ope == "d" ):
    print("\n" "La division es " , num1/num2);
else:   
    print("se equivoco de operacion");
"""
#listas        0          1        2       3   4      5
"""
miLista = ["lunes" , "Martes","Miercoles",12,True,"Sabado",1,5,0]
miListaSort = [23,5,1,0,56,100,12,89]

miLista.append("Rojo")#Agrego a la lista en el ultimo indice
miLista.remove("Martes")#Para quitar un elemnto de la lista
miListaSort.sort()#Comando para organizar listas 
miLista.pop(0)#quitar elemento de lista con el indice o por el final

print(miLista)
print("\n", miLista[1])#Indice de la lista que quiero que salga
print("\n", miLista[2:5]) # aparecen elementos del 2 al 5 de la lista
print("\n", miListaSort)#Lista Ordenada
print("------------------------------------------")
#tuplas 
miTupla = ("Lunes",0,3.45,"",2,False,"rojo",100 )
#miTupla.uppend(200) ----> no se pueden agregar elementos a las tuplas ni modificarlos
print("\n" , miTupla)
print("------------------------------------------")
#Conjuntos : No se repiten los datos que ingreses
miConjuntoA = set()
miConjuntoA = {1,2,3}
miConjuntoB = set()
miConjuntoB = {3,4,5}

print( miConjuntoA == miConjuntoB ) # conjunto A = Conjunto B
print( miConjuntoA | miConjuntoB ) # A unido B
print("------------------------------------------")
#Diccionarios (miDicionario {1:"a",2:"b" , 3:"c" , ....})
miEquipo = {"Dybala":10 , 7:"Cristiano Ronaldo" , 1:"Bufon",11:"Douglas"}

print("\n", miEquipo)
print(miEquipo[7])
print(miEquipo.get("Dybala"))
print(miEquipo.get(11,"No existe un jugador con este dorsal"))
print(miEquipo.get(6,"No existe un jugador con este dorsal"))
print(7 in miEquipo)
print(miEquipo.keys())#muestra las claves
print(miEquipo.values())#muestra los valores

print("------------------------------------------")
#Vectores

vector = [0,0,0,0,0]
vector[1] += 20
vector[4] -= 50 
vector[0] = "Ciudades"
vector.append(99) 
print(vector)
"""
#Condicional IF en una sola linea con el else 
"""
calificacion = int(input("Ingrese su calificacion "))
nota = "ganaste " if 5<calificacion<=10 else "perdiste "
print (calificacion , nota )  

num  = int(input("Ingresa un numero "))
numPrimo = "es numero primo " if num%2==0 else "no es primo"
print(num , numPrimo)
"""
"""
num = int(input("Numero "))
while num != int : 
    tipoNum = "Entero positivo" if num>0 else "es enetero negativo"
    print(num, tipoNum)
    num = int(input("Numero "))
"""
"""
contador = 0 
while contador <= 10 :
    print(contador)
    contador += 1
else:
    print("Fin del ciclo while")
"""

# definir funciones , como CODIGOFACILITO CURSO
"""
def multiplicacion (num1 , num2):
    resu = (num1*num2)
    print(resu)

num1 = int(input("Ingrese un numero "))
num2 = int(input("Ingrese otro Numero "))

multiplicacion(num1,num2)
"""
"""
print("musica"[0])
print("margarita"[2:6])
"""
"""
def multiplicacion (num1 , num2):
    return (num1*num2) , "Retornota 2 valores"

num1 = int(input("Ingrese un numero "))
num2 = int(input("Ingrese otro Numero "))

multiplicacion(num1,num2)
"""

#EJERCICICOS Listas : Escriba un programa donde tenga una lista que no repita elemntos .
import random
"""
entrada = int(input("Ingrese un valor a la lista "))

lista = []
lista.append(entrada)
print(lista)
"""
#Ingresa un numero de 4 digitos ----> para que queden en una columna 
"""
num = input("Ingrese un # 4 digitos ")

if len(num) == 4:
    print(f"{num[0]}\n{num[1]}\n{num[2]}\n{num[3]}")
else:
    print("Verifica si el numero es de 4 digitos")
"""
#Buscar dato de un vector
"""
def buscarDato (v,d):
    i=1
    while i <= v[0] and v[i] != d :
        i += 1
    if i <= v[0]:
        return i 
#Borrar dato de un vector

def borrador (v,i):
    for j in range(i,v[0]):
        v[j] = v[j+1]
        v[0] -= 1 

#buscar donde insertar un valor , en un vector ordenado

def insertar(v,d,k):
    for i in range(v[0],k-1,-1):
        v[i+1]=v[i]
    v[k] = d
    v[0] += 1


entrada = input("Ingrese un valor a la lista ")

while True:    
    lista = []
    lista.append(+= entrada)
    print(lista)
    entrada = int(input("Ingrese un valor a la lista "))

lista.insert(2,4)
print(lista)
"""
#promedio de la suma de una lista por el numero de indices
"""
def promedio (listado):
    return sum(listado) / len(listado)

resultado = promedio([10,2,5,6,7,78,1,2,3])
print(resultado)
"""

#en las funciones los parametres con *p3 para crear tupla  pi=3.1415 valor statico y van a la derecha
'''
def combinasaciones (p1,p2,*p3):
    print("\n",p1,"\n" , p2,"\n",p3 )

combinasaciones(12,23,1,2,3,4,5,6,67,7,78,8)

# parametro de una funcion **v3 se convierte en diccionario
def diccio (v1, v2, **v3):
    print(f"{v1}{v2}{v3}")

diccio (12,34,juventus="cristiano Ronaldo",messi = "barcelona" )
'''

#FUNCION LAMBDA , es una funcion en una sola linea 
#funcion 'lambda' de grados a farengia 
#grados , es el parametro
'''
funcionGrados = lambda grados : grados * 1.8 + 32
print(funcionGrados(10))
'''
#Funcion con parametros por default
'''
funvariospara = lambda p1=1 , p2=3 , p3=10 , p4=45: p1+p2-p3+p4
print(funvariospara())
'''
#Funcion lambda en una sola linea 
'''
funvariospara = lambda p1 , p2, p3 , p4: p1 > p2 and p3 >= p4
print(funvariospara(45,7,234,6))
'''
#funcion
'''
def aproRepro (aprovatorio , promedio , *notas ):
    res = sum(notas) / len(notas)
    aprovatorio = 'Felicidades Aprovo en ' if res >= 5 else 'Reprovo en ' 
    
    print(aprovatorio,int(res))

respuesta = 

print(aproRepro(1,7,9,4,10,4,3,1,10))
'''

# funion con funcion anidada
'''
e = 'e' #=> variable Global

def funcionPpal ():
    a = 'a'
    b = 'b' #=>variables Locales
    def funcionSecun():
        c = 'c' #Variable => Local
'''
#Funciones Anidadas =>Closures
'''
def saludar(userName):
    mensaje = (f'Hola Mundo soy {userName}')
    def mostrarMensaje():
        print(mensaje)
    return mostrarMensaje

userName = 'Anderson'
respuesta = saludar(userName)

respuesta()
'''

#DECORADORES
# a => Funcion Principal (decorador)
# b => Funcion De decorar
# c => Funcion decorada
# a(b) = c 
'''
def funcionA(FuncionB):
    def funcionC():
        print('estamos en la funcion C ')
    return funcionC

@funcionA 
def saludar():
    print("Hola como estas")

saludar()
'''

lista = [12,4,5,7,6,5,0,9,1,23,778,54,7,0,1,1]
lista.sort()

sinrepe = set(lista) # convertir una lista a conjunto , para no repetir elementos
print(sinrepe)

lista1 = [1,3,4,5,6,7,6565,6,7,8,89,9,9,9,8,87,66,32,2]
lista2 = [1,2,34,45,5,5,4,4,667,8,98,7 ]

a = set(lista1)
b = set(lista2)

union = list( a | b )
soloA = list( a - b )
soloB = list( b - a )
interseccion = list ( a & b )

print('',union , '\n', soloA , '\n', soloB , '\n' , interseccion)

