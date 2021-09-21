/* === Declarar variables === === === */
var nombre = "Anderson";
var numero = 07;
const PI = 3.141592; // PI = Variable constante
nombre2 = "Anderson"
numero2 = 0;
var a = 10, b = 25 ,c = 5 ,nombre3 = "Anderson" // Declarar variables en una sola linea

// === === === comparar valores === === === 
v1 = 180
v2 = "180"

console.log("v1 es igual a v2 ->",v1==v2); // (TREU) -> compara solo caracteres
console.log("v1 no es igual a v2 por que no son el mismo tipo de dato ->",v1===v2); // (FALSE) -> compara caracteres y tipo de dato

// === === === comparar valores === === ===


// === === === Asi podemos crear un comentario === === === 

function saludar(nombre) {
	console.log("Hola -> ", nombre); // Imprimir en consola
}
saludar('Diego'); // llamo la Funcion salidar 

function resta (a,b){
    console.log("Resultado: ", a-b); // console.log(muestra en consola)
} 
resta(232,42); // llamo la funcion resta

// === === === if else while for === === ===

if (a > b) { 
    console.log(a," es mayor a ",b);
}
else if (b > a){
    console.log(b," es mayor a ",a);
}
else {
    console.log(a ," es igual a ", b);
}

while(c < 10){
    console.log(nombre);
    c++;
}

for (var i = 0; i < 5; i++){
    console.log(i);
}
