#NO ELIMINAR LA SIGUIENTE IMPORTACIÓN, sirve para probar tu código en consola


#NOTA: PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
#LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO

#En este espacio podrás programar las funciones que deseas 
# usar en la función solución (NO ES OBLIGATORIO CREAR OTRAS FUNCIONES)
"""Inicio espacio para programar funciones propias"""



#PUEDES PROGRAMAR CUANTAS FUNCIONES DESEES 



"""Fin espacio para programar funciones propias"""


    #PROGRAMA ACÁ LA SOLUCIÓN

def calculadora(bits1,bits2, OP):
    resultado = ""   
    for i,j in zip(bits1,bits2):
    #===============OR=================>
        if OP == "OR":
            if i == "1" and j == "1" :
                resultado += "1"
            elif i == "0" and j == "1":
                resultado += "1"
            elif i == "1" and j == "0":
                resultado += "1"    
            elif i == "0" and j == "0":
                resultado += "0"            
    #==============AND================>
        elif OP == "AND":
            if i == "1" and j == "1" :
                resultado += "1"
            elif i == "0" and j == "1":
                resultado += "0"
            elif i == "1" and j == "0":
                resultado += "0"    
            elif i == "0" and j == "0":
                resultado += "0"
    #==============XOR=================>
        elif OP == "XOR":
            if i == "1" and j == "1" :
                resultado += "0"
            elif i == "0" and j == "1":
                resultado += "1"
            elif i == "1" and j == "0":
                resultado += "1"    
            elif i == "0" and j == "0":
                resultado += "0"
    print(resultado)                               
calculadora( "0110110110","1100011101","AND")
