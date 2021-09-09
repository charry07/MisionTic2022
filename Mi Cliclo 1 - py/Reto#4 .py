#=== === === v1 === === === === 

# """Fin espacio para programar funciones propias"""

# def actualizar_estado_editor():
#     print("\n------------------------------------------")
#     text = str(input("Ingresa el texto: "))
#     texto_escrito = []
#     rehacer = []
        

#     while text != "" :
#         texto_escrito.append(text)
#         text = str(input("Ingresa el texto: "))
        
#         while text == "DESHACER":
#             rehacer.append(texto_escrito[-1])
#             texto_escrito.pop(-1)
#             print(texto_escrito)
#             text = str(input("Ingresa el texto: "))

#         while text == "REHACER":
#             texto_escrito.append(rehacer[-1])
#             print(texto_escrito)
#             text = str(input("Ingresa el texto: "))

#     cadenaFinal = ' '.join(texto_escrito) #Convierte unaLista a Texto
#     print(cadenaFinal)

# actualizar_estado_editor()

# text = ["Definamos qué es una función de Python: "
# ,"Una función es ","un arreglo unidimensional de datos",
# "DESHACER", "DESHACER", "REHACER", "un grupo de instrucciones"]

#=== === === === === V2=== === === === === === (FUNCIONO EN AL PLATAFORMA MINTIC NOTA=5)
def actualizar_estado_editor(operaciones_usuario=[]):
    print("\n------------------------------------------")
    texto_escrito = []
    rehacer = []
    for i in (operaciones_usuario):
        
        if i != "" and i != "DESHACER" and i != "REHACER":
            texto_escrito.append(i)
            
        elif i == "DESHACER":
            rehacer.append(texto_escrito[-1])
            texto_escrito.pop(-1)
            
            
        
        elif i == "REHACER":
            texto_escrito.append(rehacer[-1])
                
    cadenaFinal = ''.join(texto_escrito)
    print(cadenaFinal)

actualizar_estado_editor(["Definamos qué es una función de Python: "
,"Una función es ","un arreglo unidimensional de datos",
"DESHACER", "DESHACER", "REHACER", "un grupo de instrucciones"])


# lis = ["Definamos qué es una función de Python: "
# ,"Una función es ","un arreglo unidimensional de datos",
# "DESHACER", "DESHACER", "REHACER", "un grupo de instrucciones"]

# for i in (lis):
#     print(i,end=' ')



