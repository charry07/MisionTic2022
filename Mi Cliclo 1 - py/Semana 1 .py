a = 20
b = 10
e = a
string = "Yo Soy Anderson Charry"
print(f"x es {a}, z es {e}")
print(a,b,e)
print(string + " y tengo 25 años")
#las cadenas (strings) no se suman o se restan con numeros 
print(a*b)
print( string * 5 ) # muestra la cadena 5 veces
print(a/b) # la divicion la muestra como numero decimal (flotante)
print(b//a)
residuo = a%b
print(residuo) 
#Operadores Logiocos
x = True
y = False
print( x and y )
#Prioridad de Operaciones 
ope1 = ( 2**2 + 4 )/ 8 
ope2 = 30-(9-8)-(7-6)
ope3 = 16 / (2 * 4)
print(ope2,ope1,ope3)

#entradas
nombre = input("Please Enter Your Name")
apellido = input(f"Good {nombre} , Write Your Last Name  ")
edad = input (f" Let's GO {nombre} {apellido} , How old are you? ");
print("yo soy " + nombre, apellido , "y tengo " + edad + " anos ")

#para sumar 2 entradas que sean numeros , se agrega "int" antes de "input"
#con esta forma se concatenan
a = input("dime 1 numero");
b = input("dime otro numero");
print(a+b)
#esta forrma se suman las entradas
a = int(input("dime un numero"))
b = int(input("dime otro numero"))
print(a+b)

