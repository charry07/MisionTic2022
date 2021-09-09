from flask import Flask , render_template , request
from flask.wrappers import Request, Request

app = Flask(__name__)
@app.route('/pagina1')
def pagina1():
    return render_template("pagina1.html")

@app.route('/pagina2')
def pagina2():
    return render_template('pagina2.html')

@app.route('/formulario')
def formulario():
    return render_template("formulario.html")

@app.route('/gracias')
def gracias():
    valor1 = request.args.get('nombre')
    valor2 = request.args.get('apellido')
    return render_template("gracias.html",nombre=valor1,apellido=valor2)

@app.errorhandler(404)
def paginaNoEncontrada(e):
    return render_template('pagina404.html'),404

if __name__ == '__main__':
    app.run(debug=True)