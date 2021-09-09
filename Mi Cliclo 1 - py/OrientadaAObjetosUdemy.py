class persona():
    def __init__(self,nombre):
        self.nombre = nombre
    def saludar(self):
        self.texto = "Hola, minombre es " + self.nombre
        return self.texto

persona1 = persona('Antonio')
print(type(persona1))
print(persona1.nombre)
texto = persona1.saludar()
print(texto)

class adulto(persona):
    def __init__(self, nombre):
        persona.__init__(self,nombre)
    def saludar(self):
        self.texto = "Hola Soy adulto"
        return self.texto
    def grabarTarjeta(self,tarjeta):
        self.tarjeta = tarjeta
    def __str__(self):
        self.texto = "Adulto : Nombre = " + self.nombre
        return self.texto

adulto1 = adulto("Anderson")
print(type(adulto1))
texto = adulto1.saludar()
print(texto)        
adulto1.grabarTarjeta("1035918779")
print(adulto1.tarjeta)

numero = 5 
print(numero)
print(adulto1)