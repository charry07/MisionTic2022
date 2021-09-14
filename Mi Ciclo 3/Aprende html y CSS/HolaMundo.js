// Asi podemos crear un comentario

function saludar(nombre) {
	console.log("Hola -> ", nombre);
}
saludar('Diego'); // llamo la Funcion salidar 

function resta (a,b){
    console.log("Resultado: ", a-b); // console.log(muestra en consola)
} 
resta(232,42); // llamo la funcion resta

// === === === === === === === === === === === === === ===
var a = 10, b = 25 ,c = 5 ,nombre = "Anderson" // Declarar variables en una sola linea

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
