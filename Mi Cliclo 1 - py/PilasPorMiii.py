from clasePila import Pila
a = Pila()
a.apilar("a")
a.apilar("e")
a.apilar("i")
a.apilar("o")
a.imprimirPila()

b = a.esVacia()
print("Pila vacía:", b)

d = a.desapilar()
print("\nDato desapilado", d)
a.imprimirPila()

a.apilar(2) # Las Apila o agregae a el principio 
a.imprimirPila()