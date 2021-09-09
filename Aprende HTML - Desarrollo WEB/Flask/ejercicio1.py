from flask import Flask , render_template , request


app = Flask(__name__)

@app.route('/ejercicio')
def cadena():
    return render_template("miprimeraweb1.html")

@app.route('/resultado')
def res():
    nombre = request.args.get('nombre')
    minuscula = any(i.islower() for i in nombre)
    numero = any(i.isdigit() for i in nombre)
    mayuscula = nombre[0].isupper()
    return render_template("res.html",minuscula=minuscula,mayuscula=mayuscula,numero=numero)

if __name__ == '__main__':
    app.run(debug=True)
