import java.util.*;// importar todas las librerias


// public class Ejercicios { // Dias de vacaciones Coca Cola
//     public static void main(String[] args) {
// //=== === === === === === Ejercicio Coca Cola (vacaciones)=== === === === === === ===\
//         Scanner nombreIn = new Scanner(System.in);
//         Scanner claveIn = new Scanner(System.in);
//         Scanner antiguedadin = new Scanner(System.in);

//         System.out.println("\n\nBIENVENIDO\n Porfavor Ingresa tu Nombre: ");
//         String nombre = nombreIn.nextLine();

//         System.out.println(nombre + ",Por favor ingresa Tu Clave: ");
//         int clave = claveIn.nextInt();
        
//         System.out.println(nombre + ", Ingresa tu antiguedad: ");
//         int antiguedad = antiguedadin.nextInt();

//         if (true) {
//             switch (clave){
//                 case 1 :
//                     if (antiguedad <= 1){
//                         System.out.println(nombre+", Tienes 6 dias de vacaciones!");
//                     }
//                     else if (antiguedad >= 2 && antiguedad <= 6){
//                         System.out.println(nombre+", Tienes 14 dias de vacaciones!");
//                     }
//                     else if (antiguedad > 7){
//                         System.out.println(nombre+", Tienes 20 dias de vacaciones!");
//                     }
//                     break;
//                 case 2 :
//                     if (antiguedad <= 1){
//                         System.out.println(nombre+", Tienes 7 dias de vacaciones!");
//                     }
//                     else if (antiguedad >= 2 && antiguedad <= 6){
//                         System.out.println(nombre+", Tienes 15 dias de vacaciones!");
//                     }
//                     else if (antiguedad > 7 ){
//                         System.out.println(nombre+", Tienes 22 dias de vacaciones!");
//                     }
//                     break;
//                 case 3 :
//                     if (antiguedad <= 1){
//                         System.out.println(nombre+", Tienes 10 dias de vacaciones!");
//                     }
//                     else if (antiguedad >= 2 && antiguedad <= 6){
//                         System.out.println(nombre+", Tienes 20 dias de vacaciones!");
//                     }
//                     else if (antiguedad > 7 ){
//                         System.out.println(nombre+", Tienes 30 dias de vacaciones!");
//                     }
//                     break;
//                 default :
//                     System.out.println("Elija bien su clave");
//             }
    
//         }

//     }   
// }
// class ForEjercicio {
//     public static void main(String[] args){
//         for (int i = 0 ,j = 100; i <= 9 ; i++ , j-- ){
//             System.out.print(i + ", "+j + ", ");
//         }
//         System.out.println("\n");
//         for (int i = 1 ; i <= 100 ; i+=i ){
//             System.out.println(i + ", ");
//         }
//     }
// }
// class Ciclo2Ejercicio1Semana2{ // Factorial de cualquier numero Entero
//     public static void main(String [] args){
//         Scanner inputt = new Scanner(System.in);
//         int numeroEntero = inputt.nextInt();
        
//         long res = 1;
//         for(int i = 1; i <= numeroEntero;i++){
//             res *=i; 
//         }
//         System.out.println(res);
//     }
// }
// class Ejercicio2s2{ // Suma Elementos de un Vector -> vector como parametro de una funcion o metodo
//     public static void main(String[] args){
//         int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
//         int s = 0;
//         for (int i = 0 ; i < vectorEntrada.length ; i++){
//             if( vectorEntrada[i] > 0 && vectorEntrada[i] % 2 == 0 ){
//                 s+=vectorEntrada[i];
//             }
//         }
//         System.out.println("\n-> Resultado: "+s);
//     }
// }
// class EJercicio2{   // solucion de la plataforma EJERCICIO 2
    
//     public static int sumaPares(int [] vector){
//         int s = 0;
//         for (int i = 0 ; i < vector.length ; i++){
//             if( vector[i] > 0 && vector[i] % 2 == 0 ){
//                 s+=vector[i];
//             }
//         }
//         System.out.println("\n-> RESULTADO = "+s);
//         return s;
//     }
//     public static void main(String[] args){
//         int [] vector = {12,3,4,56,65,45,4,4,56,7};
//         EJercicio2.sumaPares(vector);
//     }
// }
// class Ejercicio3s2{ // Promedio de una lista de un vector como parametro
//     public static double mean(int [] vector){
//         double promedio = 0;
//         double s = 0;
//         for (int i = 0 ; i < vector.length ; i++){        
//             s+=vector[i];
//             promedio = s/vector.length; 
            
//         }
//         System.out.println("\n"+promedio);
//         System.out.println(s);
//         System.out.println("\n-> EL PROMEDIO ES = "+promedio);
//         return promedio;
//     }
//     public static void main(String[] args){
//         int [] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
//         Ejercicio3s2.mean(vector);
//     }
// }
// class Ejercicio4s2{ // ordenar mitad de una lista y la otra mitad alreves->ArrayList<> a int[]
//     public static int [] ordenamientoPersonalizado(int [] vector){
//         int mitadVector = vector.length/2;
//         ArrayList<Integer> vectorOrdenado = new ArrayList<Integer>();
//         ArrayList<Integer> arrayPrimeraMitad = new ArrayList<Integer>();
//         ArrayList<Integer> arraySegundaMitad = new ArrayList<Integer>();
//         if(vector.length % 2 == 0){
//             for(int i = 0; i < mitadVector ; i++){
                
//                 arrayPrimeraMitad.add(vector[i]);    // ORDEN PRIMERA MITAD
//                 Collections.sort(arrayPrimeraMitad);
//             }
            
//             for(int i = mitadVector; i < vector.length ; i++){
//                 arraySegundaMitad.add(vector[i]);          // ORDEN PSEGUNDA MITAD
//                 Collections.sort(arraySegundaMitad);
//                 Collections.reverse(arraySegundaMitad);
//             }
//         }
//         else{
//             System.out.println("El vector Tiene que ser de -> longitud PAR <- ");
//         }
//         vectorOrdenado.addAll(arrayPrimeraMitad);
//         vectorOrdenado.addAll(arraySegundaMitad);
        
//         System.out.print(vectorOrdenado);
//         // -> convertir ArrayList<> a int[]
//         // int[] vectorOrdenado = vectorOrdenadoArray.stream().mapToInt(i -> i).toArray();
//         return vector;
//     }
//     public static void main(String[] args){
//         int [] vector = {0, 2, 1, 65, 66, 78, 12, 11,5,12};
//         Ejercicio4s2.ordenamientoPersonalizado(vector);
//     }
// }
// class Ej5{ // Suma vectorial de v1 y v2 
//     public static int [] sumaVectorial(int [] v1, int [] v2){
//         int[] s = new int[v1.length];
//         if(v1.length == v2.length){
//             for(int i = 0 , j = 0 ; i < v1.length ; i++ , j ++){
//                 int suma = v1[i]+v2[j];
//                 s[i] = suma;
//             }
//         }
        
//         return s;
//     }
//     public static void main(String[] args) {
//         int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
//         int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
//         Ej5.sumaVectorial(v1,v2);
//     }
// }
// class Ejercicio6s2{ // Covertir -> char[] a String
//     public static String join(char [] vector){
//         String vectorConcatenado = String.valueOf(vector);
//         System.out.println(vectorConcatenado);
        
//         return vectorConcatenado;
//     }
//     public static void main(String[] args) {
//         char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
//         Ejercicio6s2.join(vector);
//     }
// }