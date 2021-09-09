# import numpy as np

# x = np.array([2,4,5,3,2,3,4,5,5,4])
# print(x)
# print(type(x))
# print(x.shape)
# print("------------------------------------------")
# rango = np.arange(start=0,stop=100,step=2) # es como un for que te genera numeros del cero al 100 en saltos de 2 en 2
# print(rango)                                  
# print("------------------------------------------")
# print(rango[1:10]) # posiciones de la 1 a la 10
# rango[1:5+1] = 1.55 # cambiar el valor a las posiciones
# print(rango[0:10])
# print("------------------------------------------")
# z = np.random.random(5) # 5 numeros aleatorios del 0 al 1 
# print(z )
# mask = z > 0.5  #
# print(mask)
# print("------------------------------------------")

# # === === === === matplolib === === === ===
# import matplotlib.pyplot as plt

# #----Grafico
# x = np.arange(0,10,0.1)
# y = np.sin(x)
# fig = plt.figure(figsize=(5,5),dpi = 100)
# plt.plot(x,y, color = "darkred", linewidth = 5 , label = "Seno") # color y tamano de la linea
# plt.plot(x,y)
# plt.title("tiutlo grafica Mi prtimera grafica")
# plt.xlabel("nombre datos x") 
# plt.ylabel("nombre datos y")
# plt.show()

# print("------------------------------------------")
# #grafica dispercion

# x = np.arange(-100,101,1)
# y = np.random.random(size=x.shape)


# fig = plt.figure( figsize=(5,5), dpi = 100)

# #La función scatter permite dibujar los puntos solamente
# #Todos los colores de matplotlib: https://matplotlib.org/2.0.2/examples/color/named_colors.html
# plt.scatter(x,y, color = "darkblue")

# #Podemos colocarle título a la gráfica:

# plt.title("Gráfica con valores aleatorios")
# plt.xlabel("Rango de valores")
# plt.ylabel("Datos aleatorios")
# plt.show()

# print("------------------------------------------")
# #Grafica de la funcion x**3

# x = np.arange(-100,101,1)
# y = x**3


# fig = plt.figure( figsize=(5,5), dpi = 100)
# #Podemos ajustar el tamaño de la línea
# plt.plot(x,y, color = "darkred", linewidth = 5)

# plt.title("Gráfica de la función $x^3$")
# plt.xlabel("x")
# plt.ylabel("y")
# plt.show()

# print("------------------------------------------")
# #grafica de 2 funciones
# x = np.arange(-100,101,1)
# y1 = x
# y2 = 2*x-5

# fig = plt.figure( figsize=(5,5), dpi = 100)

# #Podemos ponerle etiquetas a cada gráfica
# plt.plot(x,y1, color = "darkred", linewidth = 5, label = "$y=x$")
# plt.plot(x,y2, color = "blue", linewidth = 2, label = "$y=2x-5$")
# #Y las mostramos con plt.legend:
# plt.legend()

# plt.title("Gráfica de las funciones")
# plt.xlabel("x")
# plt.ylabel("y")
# plt.show()

# print("------------------------------------------")
# # Histogramas
# datos = [10, 20, 20, 20, 10, 5, 20, 5, 10, 10]
# fig = plt.figure( figsize=(5,5), dpi = 100)
# #Matplotlib también permite ver histogramas
# plt.hist(datos, color = "black")
# plt.xlabel("Edad")
# plt.ylabel("Frecuencia")
# plt.title("Histograma de edades")
# plt.show()

# print("------------------------------------------")
# #Garficos de Color
# delta = 0.025
# x = np.arange(-3.0, 3.0, delta)
# y = np.arange(-3.0, 3.0, delta)
# #Creamos una malla para graficar en 3D
# X, Y = np.meshgrid(x, y)

# Z = np.exp(-X**2 - Y**2)

# fig = plt.figure( figsize=(5,5), dpi = 100)
# plt.imshow(Z, cmap='hot')
# plt.colorbar()
# plt.show()

# print("------------------------------------------")

# #=== === === === === Libreria Pandas === === === === ===
# import pandas as pd

# df = pd.read_xlsb("C:\Users\charr\OneDrive\Escritorio\TRABAJOS CAD\12 ctos.xlsb")

# === === === === === Tekinter === === === === ===
from clasePila import texto
import tkinter as tk

window = tk.TK()
"""
#tIPOS DE OBJERTOS

LABEL  : mostrar texto
button : colocar botonoes
entry : entradas de usuario
text :  

"""