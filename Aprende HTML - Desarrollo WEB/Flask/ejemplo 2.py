from flask import Flask , render_template

app = Flask(__name__)

@app.route('/')
def portada():
    return render_template('portada.html') # => Creando rutas , con HTML's ya creados

@app.route('/formularios')
def formularios():
    return render_template('Formularios.html') # => Creando rutas , con HTML's ya creados

@app.route('/miprimeraweb')
def web():
    return render_template('Mi Primera WEB.html') # => Creando rutas , con HTML's ya creados

@app.route('/colores')
def colores():
    lista_colores = ['verde', 'amarillo' , 'azul' , 'rojo' , 'rosa']
    return render_template('colores.html', colores = lista_colores) # => Creando rutas , con HTML

@app.route('/frases/<texto>')
def frases(texto):
    return render_template('frases.html.',tipo=texto)

if __name__ == '__main__':
    app.run(debug=True)