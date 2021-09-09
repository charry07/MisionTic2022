import java.util.*;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;
// === === === === === === ---- -> SEMANA 1 <- -----=== === === === === ===


class HolaMundo { // el java es un lenguaje orientado a objetos que siempre necesita una clase

    public static void main(String[] args) { // siempre necesita esta linea
        
        System.out.println("Hola Mundo Mi nombre es Anderson");
        System.out.print("En el anio "); //para no dejar espacio
        System.out.println(" ");

        // Tipos de datos 
        int i = 0 , j = 0 ; // Entero se pueden colocar varias variables en la misma linea
        String nombre = "Anderson"; // tipo string o cadenas de texto 'S' empieza con mayuscula
        char unSoloCaracter = 'a'; // almacena solo 1 caracter tipo char
        boolean esCierto = true; // tipo booleano (TRUE o FALSE)

        System.out.println(i + j + nombre + unSoloCaracter + esCierto ); // 
        
        //Incremento y decremento
        
        System.out.println(i++); //posincremento -> print y despues lo aumenta
        System.out.println(++j); //preincremento -> aumenta y despues aumenta
        
        
        // Operadores Logicos
        System.out.println("AND se representa con && ");
        System.out.println("OR se representa con || ");
        System.out.println("NOT se representa con ! ");

        if(i == j && i == 1 ){
            System.out.println("Funcona Perfectamente!");
            System.out.println("");
            System.out.println("");
            
        }
    }
}
class DiferenciasEntrePrints {
    public static void main(String[] args){
        // ->diferencia entre los print y println
        System.out.print("Funcona Perfectamente!"); // print no tiene salto de linea al final
        System.out.println("Funcona Perfectamente!"); // println si tiene salto de linea al final
        System.out.println("Funcona Perfectamente!");
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
//import java.util.Scanner;    -> necesario para una entrada por input
class IngresoPorInput{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;                                       // variables
        String nombre;

        
        System.out.print("Bienvenido, Cual es tu Nombre?: ");
        nombre = scan.nextLine();

        System.out.println("Bienvenido a clase " + nombre);
        System.out.print(nombre + " Cuantos AÑOS tienes?: ");
        edad = scan.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " Años!");
        
        // ######=== === -> CONDICIONALES <- === ===########
        // ######=== === -> CONDICIONALES <- === ===########
        // ######=== === -> CONDICIONALES <- === ===########
        
        if (edad > 18 ){
            System.out.println("Ya puedes matricularte SOLO");
            if (nombre.equals("Anderson")){
                System.out.println("Eres mi tocallo");
            }
        }
        else if (edad > 40 ){
            System.out.println("Te diran que ya estas viejo , pero intentalo");
        }
        else{
            System.out.println("Tienes que venir con acudiente");
        }
    }
        
    
}
class CompracionStrings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // crear un input entrada de datos
        String valorGuardadoEnInput = "";

        System.out.print("\n\nDigite una cadena! ");
        valorGuardadoEnInput = input.nextLine(); // llamar el input

        if (valorGuardadoEnInput.equalsIgnoreCase("Anderson")) {
            System.out.println("Eres Un CRACK!!!");                 // String igual a otro
                                                                    // ingonando las mayusculas
        }
        if ( valorGuardadoEnInput.equals("Charry")){
            System.out.println("Somos Completamente Iguales");
        }
    }
}
class CondicionalSwitch{
    public static void main(String[] args){
        Scanner entradaDatos = new Scanner(System.in);
        String variableDondeSeGuardanLosDatos ;
        
        int numeroAleatorios = (int)(Math.random() * 101); // Generar numeros aleatorios del 1 al 100

        System.out.print("\n\nEscriba el sabor del Jugo que quiere! ");
        variableDondeSeGuardanLosDatos = entradaDatos.nextLine();
        
        while (variableDondeSeGuardanLosDatos != ""){
            switch (variableDondeSeGuardanLosDatos){
                case "Mango":
                    System.out.println("El de Mango Cuestas $5000 pesos ");
                    break;
                case "Mora":
                    System.out.println("El de mora Cuestas $4000 pesos ");
                    break;
                case "pina":
                    System.out.println("El de Pina Cuestas $3500 pesos ");
                    break;
                case "Fresa":
                    System.out.println("El de fresa Cuestas $5500 pesos ");
                    break;
                case "Guanabana":
                    System.out.println("El de Guanabana Cuestas $6000 pesos ");
                    break;
                
                default:
                    System.out.println("DE ESE SABOR NO TENEMOS EN ENTOS MOMENTOS!!!");
                    break;
                
            }
            System.out.print("\n\nEscriba el sabor del Jugo que quiere! ");
            variableDondeSeGuardanLosDatos = entradaDatos.nextLine();   
        }
    }
}
class For{
    public static void main(String[] args){

        for (int i = 0; i < 10+1; i++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
        for (int i = 0; i < 10+1; i+=2){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
class ForInZipIJK{ // recorrer varias variables a la misma vez in ZIP
    public static void main(String[] args){
        for ( int i = 0, j = 0, k = 0 ; i < 10+1; i++ , j++ , k++ ){
            System.out.println(i+""+j+""+k);
        }
        for (int i = 0 ,j = 100; i <= 9 ; i++ , j-- ){
            System.out.print(i + ", "+j + ", ");
        }
    }
}
class ArreglosListas{ // listas
    public static void main( String[] args) {
        // === === === ===-> convertir ArrayList<> a int[] === === === === === ===
        // int[] listaIntAqui = ListaArrayAqui.stream().mapToInt(i -> i).toArray();
        
        String[] arr = new String[5];
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        arr[4] = "5";

        int [] lista = new int[10]; // crear listas

        for(int i = 1; i < lista.length ; i++){
            i += lista[i];
            System.out.println(lista[i]);
        }
        String [] listaDeStrings = {"Volvo", "BMW", "Ford", "Mazda"};
        
        //=== === === === ===Formas Recorrer listas forma 1 === === === === ===
        for (int i = 0; i < listaDeStrings.length ; i++){
            System.out.println(listaDeStrings[i]);
        }
        // === === === === segunda forma 2 === === === === === === 
        System.out.println("\n");
        for (String i : listaDeStrings){
            System.out.println(i);
        }
        
        
    }   
}
class Matrices{ //recorre matrices y ver diagonales
    public static void main(String[] args) {
         // crear matrices o declararlas
        int[][] miMatriz = {{9,2,5,4},{3,1,6,0},{5,7,8,1},{5,3,4,0}};
        
        // === === === === Recorrer la matriz e imprimirla=== === === ===
        System.out.print("\n'miMatriz 4x4'");
        for(int i = 0; i < miMatriz.length; i++){
            System.out.print("\n");
            for (int j = 0; j < miMatriz[i].length; j++){
                System.out.print(miMatriz[i][j]);
            }
        }
        System.out.println("\n\nDiagonal Primaria");
        // === === === === Recorrer diagonal principal=== === === ===
        for(int i = 0,j = 0 ; i < miMatriz.length ; i++ , j++){
            System.out.print(miMatriz[i][j]);
        }
    }
}
class Stringss{
    public static void main(String[] args){
        String nombre = "Anderson";
        String n2 = "Anderson";
        Scanner inputt = new Scanner(System.in);

        System.out.println("\n\nIntroduce una cadena de caracteres!!");
        String cadenaGuardada = inputt.nextLine();
        System.out.println("La Cadena Tiene ->"+cadenaGuardada.length()+"<- Caracteres");
        
        
        
        if (nombre == n2){
            System.out.println("Son Iguales");
        }
    }
}
class InputComoVentana{ // salta una venta para pedir dato por pantalla
    public static void main(String[] args){
        int nElementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN # -- ->"));
        System.out.println(nElementos);
    }
}
class ArrayListaa{
    public static void main(String[] args){
        
        // === === === ===-> convertir ArrayList<> a int[] === === === === === ===
        // int[] listaIntAqui = ListaArrayAqui.stream().mapToInt(i -> i).toArray();

        ArrayList<String> cars = new ArrayList<String>();
        
        //Agregar Elementos
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Twingo");
        cars.add("Spark");
        System.out.println("\n\nAgregar elementos-> "+cars);

        // eliminar Elementos
        cars.remove("Mazda");
        System.out.println("Remover 'Mazda' -> "+cars);
        cars.remove(0);
        System.out.println("Remover indice [0] -> "+cars);
        
        // modificar elemento de un indice en especifico
        cars.set(0,"Opel");
        System.out.println("Intercambiar 'Opel' en indice[0] -> "+cars);

        //tamaño de la lista
        System.out.println("El Tamaño de la lista es -> "+cars.size());

        // Obtener Elementos por indice en especifico
        System.out.println("El inidice 2 de la lista es -> "+cars.get(2));

        // Ordenar lista
        Collections.sort(cars);

        // Recorrer la lista con for
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //=== recorrer lista FOR EACH ===
        System.out.println("\nFOR EACH -> ");
        for (String i : cars) {
            System.out.println(i);
        }


    }   
}
class Prueba {
    public static void main(String[] args) {

        ArrayList<String> pedidos = new ArrayList<String>();
        String ID = "0937";
        double costoPedido = 50000;

        pedidos.add("2344");
        pedidos.add("2345");
        pedidos.add("2346");
        pedidos.add("0937");
        pedidos.add("2348");
        pedidos.add("0937");
        
        for(int i = 0; pedidos.size() > 0; i++) {
            System.out.println(pedidos.get(i));
            if(pedidos.get(i).equals(ID)) {
                System.out.println("entro a IF");
                System.out.println(costoPedido);
            }
        }
        
    }
}