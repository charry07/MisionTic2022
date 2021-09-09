import java.util.*;
// === === === === === === METODOS O FUNCIONES(""); === === === === === ===

import javax.swing.JFrame;

public class Semana3 {
    public static void main(String[] args){
        int [] vector = {12,4,5,6,7,8,5,6,0,78,6,4,0,0};
        // === === === Importar metodos o funciones desde otro archivo === === ===
        Ejercicio4s2.ordenamientoPersonalizado(vector); 
    }
}

class Operaciones{
    public static int sumas(int n1 , int n2){
        int suma = n1 + n2;
        System.out.println("\nResultado = "+suma);
        return suma;
    }

    public static int restas(int n1 , int n2){
        int resta = n1 - n2;
        System.out.println("Resultado = "+resta);
        return resta;
    }

    public static int multiplicaciones(int n1 , int n2){
        int multiplicacion = n1 * n2;
        System.out.println("Resultado = "+multiplicacion);
        return multiplicacion;
    }

    public static int divisiones(int n1 , int n2){
        int division = n1 / n2;
        System.out.println("Resultado = "+division);
        return division;
    }
}

class Resultados{
    public static void main (String[] args){
        Operaciones.sumas(10,5);
        Operaciones.restas(10,5);
        Operaciones.multiplicaciones(10,5);
        Operaciones.divisiones(10,10);
    }
}


class Ej1PagoEmpleados{
// //Una compañía paga semanalmente a sus empleados, quienes se dividen en cuatro tipos: 
// empleados asalariados que reciben un salario semanal fijo, sin importar el número de horas trabajadas; 
// empleados por horas, que perciben un sueldo por hora y pago por tiempo extra 
// (es decir, 1.5 veces la tarifa de su salario por horas), 
// por todas las horas trabajadas que excedan a 40 horas; empleados por comisión, 
// que perciben un porcentaje de sus ventas, y empleados asalariados por comisión, que obtienen un
// salario base más un porcentaje de sus ventas. Para este periodo de pago, la 
// compañía ha decidido recompensar a los empleados asalariados por comisión, 
// agregando un 10% a sus salarios base. La compañía desea escribir una aplicación 
// que realice sus cálculos de nómina en forma polimórfica.
    public static void main(String[] args) {
        Scanner inTipoEmpleado = new Scanner(System.in);
        System.out.println("\n\n OPCIONES \n 1.asalariado     2.horas    3.comison    4.asalariado con comison");
        System.out.print("\nPor favor Digite que tipo de empleado es: ");
        String tipoDeEmpleado = inTipoEmpleado.nextLine();

        double salario = 0 ;

        if(tipoDeEmpleado.equalsIgnoreCase("asalariado")){ //ASALARIADO
            Scanner inSalario = new Scanner(System.in);
            System.out.print("Ingrese su salalario");
            salario = inSalario.nextInt();

            System.out.println("Su Salario Sigue Igual");

        }
        else if (tipoDeEmpleado.equalsIgnoreCase("horas")){ // POR HORAS

            Scanner inHoras = new Scanner(System.in);
            System.out.print("Ingrese Horas Trabajadas: ");
            int numeroHoras = inHoras.nextInt();

            Scanner invalorHoras = new Scanner(System.in);
            System.out.print("Ingrese Valor de hora: ");
            int valorHoras = inHoras.nextInt();

            if(numeroHoras >= 40 ){
                numeroHoras -= 40;
                salario = ((valorHoras*1.5)*numeroHoras)+40*valorHoras;
                
            }
            else{
                salario = valorHoras*numeroHoras;
            }
            
            
        }
        else if(tipoDeEmpleado.equalsIgnoreCase("comision")){ // COMISION
            Scanner inVentas = new Scanner(System.in);
            System.out.print("Ingrese Numero de Ventas: ");
            int ventas = inVentas.nextInt();

            Scanner inPorcentajeVenta = new Scanner(System.in);
            System.out.print("Ingrese % Comision por ventas: ");
            double porcentajeVenta = inPorcentajeVenta.nextInt();

            Scanner inValorVenta = new Scanner(System.in);
            System.out.print("Ingrese Valor de las ventas: ");
            double valorVenta = inValorVenta.nextInt();

            porcentajeVenta = porcentajeVenta/100;

            salario = (ventas*valorVenta)*(porcentajeVenta/100);

        }
        else if(tipoDeEmpleado.equalsIgnoreCase("asalariado con comision")){ //ASALARIADO POR COMISION
            Scanner inSalario = new Scanner(System.in);
            System.out.print("Ingrese su salalario Base: ");
            salario = inSalario.nextInt();

            Scanner incomisiones = new Scanner(System.in);
            System.out.print("Ingrese sus comisiones: ");
            int comisiones = incomisiones.nextInt();

            salario = (salario*0.1)+comisiones+salario;

        }
        else{
            System.out.println("Revise bien su tipo de empleado , -> Mira las OPCIONES!");
            System.out.println("\n OPCIONES \n 1.asalariado     2.horas    3.comison    4.asalariado con comison\n");
        }
        System.out.print("*Este es su Salario: $"+salario+" cop\n\n");
    }
}


