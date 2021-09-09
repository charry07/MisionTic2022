public class Taxi extends Vehiculo{
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    double distanciaRecorrida = 0;
    boolean segurosActivados = false;
    
    //Inserte acá el método constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor);
    }


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void reiniciarTaximetro(){
        distanciaRecorrida = 0;
    }
    public void recogerPasajero(){
        if(nPasajeros == 0  && enMarcha == false && segurosActivados == false ){
        nPasajeros += 1;
        }
        System.out.println("recojer pasajero: " + nPasajeros);
    } 
    public double calcularPasaje (){
        return  3000+(2300*distanciaRecorrida);
    }
    public void presionarBotonPanico(){
        enMarcha = false;
        segurosActivados = false;
        dejarPasajero();
        cantidadDinero -= calcularPasaje();
        System.out.println("boton panico -0-0-0-0-0-0-0-" );
    }
    public void dejarPasajero(){
        if(nPasajeros > 0 && segurosActivados == false){
            cantidadDinero += calcularPasaje();
            nPasajeros -= 1;
            distanciaRecorrida = 0;
        }
        
        System.out.println("dejarPasajero:  " + nPasajeros + " <---$: "+cantidadDinero);
    }
    
    public void gestionarSeguros(){
        if(enMarcha == false){
            if(segurosActivados == true){
                segurosActivados = false;
            }
            else if(segurosActivados == false){
                segurosActivados = true; 
            }
        }
        System.out.println("seguros: " + segurosActivados);
    }
    
    public void gestionarMarcha(){
        if(motorEncendido == true){
            if(enMarcha == true){
                enMarcha = false;
            }
            else if(enMarcha == false && segurosActivados == true){
                enMarcha = true; 
            }
        }
        System.out.println("enMarcha: " + enMarcha);
    }
    
    public void moverDerecha(double d){
        if(enMarcha == true && segurosActivados == true && nPasajeros > 0){ 
        localizacionX += d;
        distanciaRecorrida += d;
        }
        System.out.println("mover X: " + localizacionX);
    }
    public void moverIzquierda(double d){
        if(enMarcha == true && segurosActivados == true && nPasajeros > 0){ 
        localizacionX -= d;
        distanciaRecorrida += d;
        }
        System.out.println("mover X: " + localizacionX);
    }
    public void moverArriba(double d){
        if(enMarcha == true && segurosActivados == true && nPasajeros > 0){ 
        localizacionY += d;
        distanciaRecorrida += d;
        }
        System.out.println("mover Y: " + localizacionY);
    }
    public void moverAbajo(double d){
        if(enMarcha == true && segurosActivados == true && nPasajeros > 0){ 
        localizacionY -= d;
        distanciaRecorrida += d;
        }
        System.out.println("mover Y: " + localizacionY);
    }
    
    //Inserte acá los SETTERS Y GETTERS
    ///////////////////////////////////////////////////
    public boolean isSegurosActivados(){
        return segurosActivados;
    }
    public void setSegurosActivados (boolean segurosActivados){
        this.segurosActivados = segurosActivados;
    }
    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////
    public double getDistanciaRecorrida (){
        return distanciaRecorrida;
    }
    public void setDistanciaRecorrida(double distanciaRecorrida){
        this.distanciaRecorrida = distanciaRecorrida;
    }
    ///////////////////////////////////////////////////
    

} 

class SolutionsTaxi {
    public static void main(String[] args){
        Taxi taxi1 = new Taxi("Anderson");
        taxi1.gestionarMotor(); 
        taxi1.recogerPasajero();
        taxi1.gestionarSeguros();
        taxi1.gestionarMarcha(); 
        taxi1.moverAbajo(5);
        taxi1.moverDerecha(6);
        taxi1.moverIzquierda(2);
        taxi1.gestionarSeguros();
        taxi1.gestionarMarcha();
        taxi1.dejarPasajero();
        taxi1.dejarPasajero();
        taxi1.gestionarSeguros();
        taxi1.dejarPasajero();
        taxi1.recogerPasajero();
        taxi1.gestionarSeguros();
        taxi1.moverArriba(1);
        taxi1.gestionarMarcha();
        taxi1.gestionarSeguros();
        taxi1.dejarPasajero();
        // taxi1.moverIzquierda(2);
        // taxi1.dejarPasajero();
        // taxi1.gestionarMotor();
        // taxi1.calcularDistanciaAcopio();
    }
}
