from flask  import Flask

app = Flask(__name__)

@app.route('/')
def principal():
    return '<h1>Hola Buenos Dias</h1>'

@app.route('/adios') # => Crear las Rutas
def adios():
    return '<h1>Adios Hasta la proxima</h1>'

@app.route('/adios/paratodos') # => Crear las Rutas
def paratodos():
    return '<h1>A Todos</h1>' # => lo que aparecera en la pagina

@app.route('/adios/paratodos/ami') # => Crear las Rutas
def ami():
    return '<h1>Este Soy Yo </h1>'

@app.route('/saludar/<nombre>')# => Crear Rutas Dinamicas
def saludar(nombre):
    return '<h2>Hola {} , Buenos Dias </h2>'.format(nombre)

@app.route('/saludar/letra/<nombre>')# => Crear Rutas Dinamicas
def letra(nombre):
    return '<h2>{},la letra en posicion 5 es: "{}" </h2>'.format(nombre,nombre[5])

@app.route('/saludar/cuentaletras/<nombre>')# => Crear Rutas Dinamicas
def cuentaletras(nombre):
    valor = len(nombre)
    return '<h2>La palabra "{}" Tiene "{}" Letras </h2>'.format(nombre,valor)

@app.route('/datos/<nombre>/<edad>') # => Crear Rutas Dinamicas
def datos(nombre,edad):
    return '<h1>{} tiene {} años'.format(nombre,edad)


@app.route('/suma/<number1>/<number2>') #
def suma(number1,number2):
    suma = int(number1) + int(number2)
    return '<h1> La suma de {} y {} es igual a: {}'.format(number1,number2,suma)

if __name__ == "__main__":
    app.run(debug=True) # => "debug=True" nos muestra los errores ded la pagina