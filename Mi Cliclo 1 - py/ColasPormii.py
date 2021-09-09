from claseCola import Cola
import random

cola = Cola()

for i in range(4):
    cola.encolar(random.randint(0,10))
cola.imprimirCola()

cola.encolar(6)
cola.imprimirCola()

d = cola.desencolar()
