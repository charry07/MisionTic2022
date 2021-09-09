public class Autobus extends Vehiculo{

    
    
    //Inserte acá los atributos
    boolean puertaAbierta;
    

    
    //=== === ===Inserte acá el método constructor === === ===
    public Autobus(String nombreConductor, int nMaxPasajeros) {
        super(nombreConductor, nMaxPasajeros);
        
    }
    
    //=== === ===Inserte acá los métodos (NO LOS GETTER Y SETTERS)=== === ===
    public void recogerPasajero (int estrato){
        if(nPasajeros <nMaxPasajeros ) {  
            if(puertaAbierta == true ){
                nPasajeros += 1;
                if (estrato == 0 || estrato == 1 || estrato == 2){
                    cantidadDinero += 1500;
                }
                else if (estrato == 3 || estrato == 4){
                    cantidadDinero += 2600;
                }
                else if (estrato == 5 || estrato == 6){
                    cantidadDinero += 3000;
                }
                System.out.println("PASAJERO" );
            }
            else if (nPasajeros == nMaxPasajeros){
                puertaAbierta = false;
            }
        }
        else{
            System.out.println("Limite de pasajero");
        }
    }
    //---------------------------------------------------------
    public void gestionarMarcha(){
        if(isEnMarcha() == false && puertaAbierta == false){
            setEnMarcha(true);
        }
        else{
            setEnMarcha(false);
        }
        System.out.println("Marcha: <-" + enMarcha);
    }
    //----------------------------------------------------
    public void gestionarPuerta(){
        if(puertaAbierta == false && isEnMarcha() == false){
            puertaAbierta = true;
        }
        else{
            puertaAbierta = false;
        }
        System.out.println("Puerta: "+puertaAbierta);
    }
    //--------------------------------------------------------
    public double calcularPasaje(int estrato){
        double valorPasaje = 0;
        if (estrato == 0 || estrato == 1 || estrato == 2){
            valorPasaje = 1500;
        }
        else if (estrato == 3 || estrato == 4){
            valorPasaje = 2600;
        }
        else if (estrato == 5 || estrato == 6){
            valorPasaje = 3000;
        }
        return valorPasaje;
    }
    
    

    //=== === ===Inserte acá los SETTERS Y GETTERS=== === ===
    ////////////////////////////////////////////////
    public boolean isPuertaAbierta(){
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta){
        this.puertaAbierta = puertaAbierta;
    }
    
}

class SolutionsAutobus {
    public static void main(String[] args){
        Autobus camion1 = new Autobus("Anderson",2);
        camion1.gestionarPuerta(); 
        camion1.recogerPasajero(1);
        camion1.recogerPasajero(3);
        camion1.recogerPasajero(6); 
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.gestionarMarcha();
        camion1.gestionarMotor();
        camion1.gestionarMarcha();
        camion1.moverArriba(1);
        camion1.moverIzquierda(2);
        camion1.moverAbajo(3);
        camion1.recogerPasajero(6);
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.recogerPasajero(4);
        // camion1.recogerPasajero(6);
        // camion1.gestionarWifi();
        // camion1.gestionarAireAcondicionado();
        // camion1.moverIzquierda(2);
        // camion1.dejarPasajero();
        // camion1.gestionarMotor();
        // camion1.calcularDistanciaAcopio();
    }
}

