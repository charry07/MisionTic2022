import csv 

import pandas as pd

def solucion():
    file = pd.read_csv("GOOG.csv",sep=',' ,header=0) # Abrir Archivo en modo leectura

    analisis_archivo = "analisis_archivo.csv"
    csv = open(analisis_archivo,"w")
    titulo='Fecha\tConcepto\n'
    
    csv.write(titulo)

    file['Close'].apply(lambda x: float(x))
    file['High'].apply(lambda x: float(x))
    file['Low'].apply(lambda x: float(x))

    for i,j,k in zip(file['Date'],file['High'],file['Low']):
        prom = (j+k)/2
        if prom == min(((file['Low'])+(file['High']))/2) :
            lowest_mean = min(((file['Low'])+(file['High']))/2)
            date_lowest_mean = i

        if prom == max(((file['Low'])+(file['High']))/2) :
            highest_mean = max(((file['Low'])+(file['High']))/2)
            date_highest_mean = i
    
    print(f"\n\n Fecha Promekdio Menor: {date_lowest_mean} Promedio Dia Mas BAJO: {lowest_mean}\
        \n Fecha Promedio Mayor: {date_highest_mean} Promedio Dia Mas Alto: {highest_mean}\n\n")

    for i,j in zip(file['Date'],file['Close']):
        csv.write(i)
        csv.write('\t')
        if j < 1624:
            csv.write('MUY BAJO')
        elif j < 1854 and j >= 1624:
            csv.write('BAJO')
        elif j < 2084 and j >= 1854:
            csv.write('MEDIO')
        elif j < 2314 and j >= 2084:
            csv.write('ALTO')
        elif j >= 2314 :
            csv.write('MUY ALTO')
        csv.write('\n')

    return date_lowest_mean, lowest_mean,date_highest_mean, highest_mean

solucion()



# def solucion():
#     #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.

    # return date_lowest_mean, lowest_mean, date_highest_mean, highest_mean



