# Ejemplos de uso de operadores relacionales

a = 40
b = 30
c = 30
d = 80
rol = "estudiante"

"""print(a > b) #True
print(b >= c) #True
print(a < d) # True
print(40 <= b)#False
print("----------")
print(30 == c) #True
print(rol == "estudiante") #True
print(rol != "Estudiante")  #True
print(d != 80) #False 
"""
# --------------------------------------
""""a = 16
b = True
c = 4
d = 8
e = 5
# Operadores Logicos
print(a > c and e <= d)
print(b or (d - e) > a / c)
# ------------------------------
resultado = not b and c < d or a / d <= e
print(resultado)
print(not resultado)
print("---------------------------------")
a = True
b = True
c = False
d = 0True
print(a and b and c)
print("--------------------")
print(0 == False)
print(1 == False)
print(20 == True)
print("----------------------------")
print(bool(0))
print("x es de tipo", type(0))
print("------------------------------")
print("estudiante" == "estudiante")
print("estudiante" == "Estudiante")
print("------------------------------------------")
print("al" < "Aa")
print("------------------------------------------") """
# Condicional IF
"""numero1 = int(input("Elija Un numero"))
numero2 = int(input("otro numero "))
numero3 = int(input("ingrese numero"))
if (numero1 + numero2 == numero3 ):
    print(f" la suma {numero1} y {numero2} es igual a  {numero3}")
else:
    print(f"la suma de {numero1} y {numero2} no es igual a {numero3}") """
# IF ultilizado para aumento de salario
"""salario = float(input("Entre Salario Actual"))
au = 0
if (salario < 1000 ):
    au = salario * 0.1
nuevoSalario = salario + au 
print(f"salario actual {salario} ; aumento {au} ; Nuevo salario {nuevoSalario}");

print("------------------------------------------")
    # 2da manera , para aumento de salario
salario = float(input("Entre Salario Actual"))
if (salario < 1000 ):
    au = salario * 0.1
else: 
    au = 0
nuevoSalario = salario + au 
print(f"salario actual {salario} ; aumento {au} ; Nuevo salario {nuevoSalario}");
"""
# condiciones para formar un triangulo
"""
n1 = int(input("Elija Un numero"))
n2 = int(input("otro numero "))
n3 = int(input("ingrese numero"))

if (n1 + n2 > n3):
    if (n1 + n3 > n2):
        if (n2 + n3 > n1):
            print(f" {n1} {n2} y {n3} si pueden formar un triangulo")
        else:
            print(f" {n1}  {n2} y {n3} no pueden formar un triangulo")
# 2da forma de condiciones para formar un triangulo

if (n1 + n2 > n3 and n1 + n3 > n2 and n2 + n3 > n1):
    print(f"{n1} , {n2} y {n3} Pueden formar un Trinagulo")
else:
    print(f"{n1} , {n2} y {n3} NO PUEDEN FORMAR UN TRIANGULO "); """
"""
print("------------------------------------------")
# Condiciones anidadas if y else , para elegir una opcion con entre varias variables
nombre = input("Ingrese su nombre")
genero = int(input("Ingresa 0 para FEMENINO y 1 para MASCULINO"))
peso = int(input("Ingresa Tu PESO en kilogramos"))
estatura = int(input("Ingresa Tu ESTATURA en Centimetros"))

if ( estatura > 180 ):
    if ( peso > 70 ):
        if ( genero == 0 ):
            print(F"{nombre} es Reina de Belleza");
        else:
            print(F"{nombre} es Cantautor");
    else:
        print(F"{nombre} es Arbitro de Futbol");
else:
    print(F"{nombre} es Jugador de Parques");
print("Paciente clasificado");

print("------------------------------------------") 
"""
# Algoritmo que lea 3 numeros y los escriba ascendentemente
""" a = int(input("Ingrese un # entero"))
b = int(input("Ingrese otro # entero"))
c = int(input("Ingrese el ultimo # entero"))

if ( a < b and b < c ):
    print(f" {a} , {b} , {c} ");
elif ( a > b > c):
    print(f" {c} , {b} , {a} ");
elif ( b < a < c ):
    print(f" {b} , {a} , {c} ");
elif ( b < c < a ):
    print(f" {b} , {c} , {a} ");
elif ( c < a < b ):
    print(f" {c} , {a} , {b} ");
elif ( a < c < b ):
    print(f" {a} , {c} , {b} ");
"""
# condiciones anidadas IF / ELIF ELSE 
# algoritmo que lea el nombre y estado civil
"""
nombre = input(" Write your name ");
estadoC = int(input("Digita 1 para Soltero , 2 casado , 3 Separado ,\
4 Viudo , 5 Union Libre  "));

if ( estadoC == 1 ):
    print(F" {nombre} , Tu estas SOLTER@  ")
elif ( estadoC == 2 ):
    print(F" {nombre} , Tu estas CASAD@ ")
elif ( estadoC == 3 ):
    print(F" {nombre} , Tu estas SEPARAD@  ")
elif ( estadoC == 4 ):
    print(F" {nombre} , Tu estas VIUD@  ")
elif ( estadoC == 5 ):
    print(F" {nombre} , Tu estas en UNION LIBRE  ")
else:
    print(F"ERROR , {nombre} El estado civil no esta REGISTRADO ");
"""
print("------------------------------------------")
# algoritmo , valor de vuelo a ciudades de destino
"""
nombre = input("Escriba su nombre ")
edad = int(input("Ingrese Su EDAD "))
ciudad = int(input("Ingrese Ciudad De Salida "))
ciudad2 = int(input("Ingrese Ciudad de Destino "))

if ( 1 <= ciudad <= 5 and 1 <= ciudad2 <=5 and ciudad != ciudad2 ):
    
    if ( ciudad == 5 or ciudad2 == 5 ):
        precio = 980000
    elif ( ciudad == 1 ): #Origen Medellin
        if ( ciudad2 == 2 ): # Destino Bogota
            if ( edad < 60 ):
                precio = 210000
            else:
                precio = 200000
        elif ( ciudad2 == 3 ): # Destino Cali
            precio = 250000 - 1000*edad*0.1
        elif ( ciudad2 == 4 ): #Detino Barranquilla
            precio = 300000 + 1000*edad
    elif ( ciudad == 2 ): # Origen Bogota
        if ( ciudad2 == 1 ): # Destino Medellin 
            if ( edad >= 80 ):
                precio = 0
            else:
                precio = 200000  
        elif ( ciudad2 == 3 ): #destino Cali
            if ( edad < 60 ):
                up = ( 60 - edad )
                if ( up > 20000 ):
                    up = 20000
                precio = 20000 + up
            else:
                precio = 200000  
        elif ( ciudad2 == 4 ):
            if ( edad >= 60 ):
                precio = 400000 + 0.05*edad*10000
            else:
                precio = 400000 
    elif ( ciudad == 3 ): # Origen Cali
        if ( ciudad2 == 1 ): # destino medellin
            precio = 350000
        elif ( ciudad2 == 2 ): # detino bogota
            if ( edad < 60 ):
                precio = 280000 + 20000
            else:
                precio = 280000
        elif ( ciudad2 == 4 ): # destino Barranquilla
            if ( edad < 60):
                precio = 190000 + 10000
            else:
                precio = 190000
    elif ( ciudad == 4 ): # Origen Barranquilla
        if ( ciudad2 == 1 ): # destino Medellin
            if ( edad < 10 ):
                precio = 250000
            else:
                precio = 500000
        elif ( ciudad2 == 2 ): # Destino Bogota
            if ( edad < 30 ):
                precio = 210000 + 30000
            else:
                precio = 210000
        elif ( ciudad2 == 3 ): # destino Cali
            if ( edad > 60 ):
                up2 = ( 60 - edad )
                precio = 350000 + (up2*10000)
            else:
                precio = 350000
    print(f" Hola {nombre} , de {ciudad} a {ciudad2 } el precio es {precio}");

else:
    print("Los datos de las ciudades son invalidas por favor verifiquelas")
"""
#Estructuras de condicion Ciclo >>>> WHILE - FOR 
#While
"""
nombre = input("Escriba su nombre ");
while nombre != "":
    print(f"Buenos dias {nombre} ");
    nombre = input("Escriba su nombre ");
print("todos los estudiantes fueron saludados");
"""
#Aumento de salario a los empleados de una empresa
"""
nombre = input("Ingrese el nombre del empleado: ")
while nombre != "":
    salario = int(input(f"Ingrese el salario del empleado {nombre}: "))
    aumento = 0.
    if salario < 1000:
        aumento = salario * 0.1
    nuevoSalario = salario + aumento
    print(f" {nombre} , {salario}, {aumento}, {nuevoSalario} ")
    nombre = input("Ingrese el nombre del empleado: ")
print("Actualización de salarios finalizada")  
"""
#
"""
n = int(input("Ingrese un numero"))
i = 1
sumatoria = 1 
while i <= n : 
    sumatoria *= 1
    i = i + 1 
print(f"El factorial {n} es {sumatoria} ");
"""
#Funcionamiento del FOR {for i range (inicio, fin , salto)}
"""
for i in range (0,11,2):
    print(i)

print("------------------------------------------")

for i in range (0,11,1):
    print(i, end = " " ) # end = "  " (se hace para tener espacio entre caracteres)
"""
#Piramides con for
"""
for num in range ( 1 , 9 + 1 , 1 ):
    
    for j in range ( 1 , num + 1 , 1):
        print (num , end = "")
    print("\n", end = "" );
    """
#Elaborar un algoritmo que lea nombre de un empleado, estado civil, edad y salario actual
"""
name = input("What's Your Name ")
old = int(input("How old are You ? "))
maritial = input("Which is your Maritial status ? en minusculas ")
salaryA = int(input(" Which is your Current salary? "))

while (name != ""): 
    if (maritial == "soltero" or "casado"):
        if ( maritial == "soltero" and old < 30 ):
            salaryN = int(salaryA * 1.1)
            au = salaryA * .1
            up = "10 %"
        elif ( maritial == "soltero" and old > 30 ):
            salaryN = int(salaryA * 1.12)
            au = salaryA * .12
            up = "12 %"
        elif ( maritial == "casado" and old < 25 ):
            salaryN = int(salaryA * 1.12)
            au = salaryA * .12
            up = "12 %"
        elif ( maritial == "casado" and old > 25 ):
            salaryN = int(salaryA * 1.15)
            au = salaryA * .15
            up = "15 %"
        elif ( maritial == "separado" and old < 20 ):
            salaryN = int(salaryA * 1.08)
            au = salaryA * .08
            up = "8 %"
        elif ( maritial == "separado" and old > 20 ):
            salaryN = int(salaryA * 1.10)
            au = salaryA * .1
            up = "10 %"
        elif ( maritial == "viudo" and old < 30 ):
            salaryN = int(salaryA * 1.15)
            au = salaryA * .15
            up = "15 %"
        elif ( maritial == "viudo" and old > 30 ):
            salaryN = int(salaryA * 1.12)
            au = salaryA * .12
            up = "12 %"
        elif ( maritial == "union libre" and salaryA < 1000 ):
            salaryN = int(salaryA * 1.20)
            au = salaryA * .20
            up = "20 %"


        print(f"{name} Tienes {old} eres {maritial} , tu salario es {salaryA} se te aumentara \
el {up} ese aumento es {au} y este sera tu nuevo salario {salaryN} ");

    name = input("What's Your Name ")
    old = int(input("How old are You ? "))
    maritial = input("Which is your Maritial status ? en minusculas ")
    salaryA = int(input(" Which is your Current salary? "))
print("todos los empleados ya fueron sensados");
"""
#contador promedio cumulador
"""
tsa = 0.
tau = 0.
tns = 0.
contador = 0
nombre = input("entre nombre ")
while nombre != "":
    salario = int(input(f"{nombre} entre salario "))
    tsa = tsa + salario
    contador = contador + 1
    aumento = 0.
if salario < 1000:
    aumento = salario * 0.1
    tau = tau + aumento
nuevoSalario = salario + aumento
tns = tns + nuevoSalario
print("Nombre", nombre, "\tsalario", salario, "\tAumento\t", aumento, "\tNuevo salario\t",nuevoSalario)
nombre = input("entre nombre ")
print("Total empleados", contador)
print("Total salarios anteriores ", tsa)
print("Total aumentos ", tau)
print("Total nuevos salarios ", tns)
"""
# tablas de multiplicar
"""
n = int(input("entre número entero "))

x = 1

while x <= n:

            i = 1

            while i <= 10:

                        r = x * i

                        print(x, "*", i, "=", r)

                        i = i + 1

            x = x + 1

            print(" ")
"""

# sumer numeros desde 1 hasta n 
"""
n = int(input(" Intruduzca un numero "))
suma = 0 
for i in range (1 , n+1 , 1):
    for j in range ( 1 , i+1 , 1 ):
        suma = suma + 1
print(f"La suma es {suma}");

# imprime numeros de 1 al 100
for i in range(0 , 100+1 , 1 ):
    print(i)
"""
# numeros desde una entada hasta otra
"""
nInicio = int(input("Ingrese el numero de inicio "))
nFin = int(input("Ingrese hasta que numero "))

for i in range(nInicio , nFin + 1 , 1 ):
    print(i);
for i in range(nInicio , nFin  , 1 ):
    print(i);
for i in range(nInicio , nFin + 1 , 4 ):
    print(i);
"""

#Ejercicio 1 Escriba un programa en Python que lea dos cargos, luego usando esos\
#  cargos lea los nombres completos correspondientes y \
# por último imprima los nombres con sus respectivos cargos, cada uno en una línea.
"""
name = input("Ingrese su nombre ");
job = input("Ingrese su ocupacion ");

print(f"{name} {job}");
"""

#Elabore un programa en Python que lea un entero de cuatro dígitos y produzca
#  como salida los dígitos del número leído con su correspondiente mensaje
"""
num = int(input("Ingrese digito"))
num2 = int(input("Ingrese digito"))
num3 = int(input("Ingrese digito"))
num4 = int(input("Ingrese digito"))

print(f" {num} \n {num2} \n {num3} \n {num4} ")
"""
import semana3 
