public class Autobus{

    
    //Inserte acá los atributos
    String nombreConductor;
    int nPasajeros = 0;
    double cantidadDinero = 0;
    int nMaxPasajeros;
    double localizacionX = 0;
    double localizacionY = 0;
    boolean puertaAbierta;
    boolean aireAcondicionadoActivado = false;
    boolean motorEncendido = false;
    boolean wifiEncendido = false;
    boolean enMarcha = false;

    
    //=== === ===Inserte acá el método constructor === === ===
    public Autobus(String nombreConductor,int nMaxPasajeros,Boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaxPasajeros = nMaxPasajeros;
        this.puertaAbierta = puertaAbierta;
        
    }
    //=== === ===Inserte acá los métodos (NO LOS GETTER Y SETTERS)=== === ===
    public void recogerPasajero (int estrato){
        if(nPasajeros <nMaxPasajeros ) {  
            if(puertaAbierta == true){
                if(enMarcha == false && puertaAbierta == true){
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
                }
            }
        }
    }
    public void dejarPasajero(){
        if(enMarcha == false && puertaAbierta == true){
            nPasajeros -= 1;
        }
    }
    public double calcularDistanciaAcopio(){
        double distanciaAcopio = Math.sqrt((Math.pow(localizacionX,2)) + (Math.pow(localizacionY,2)));
        return distanciaAcopio;
    }
    public void gestionarPuerta(){
        System.out.println("Puerta: " + puertaAbierta);
        if(puertaAbierta == true){
            puertaAbierta = false;
        }
        else if(puertaAbierta == false && enMarcha == false){
            puertaAbierta = true; 
        }
        System.out.println("Puerta: "+puertaAbierta);
    }
    public void gestionarAireAcondicionado(){
        if(motorEncendido == true){
            if(aireAcondicionadoActivado == true){
                aireAcondicionadoActivado = false;
            }
            else if(aireAcondicionadoActivado == false){
                aireAcondicionadoActivado = true; 
            }
        }
    }
    public void gestionarMotor(){
        if(motorEncendido == true){
            motorEncendido = false;
            wifiEncendido = false;
            aireAcondicionadoActivado = false;
            enMarcha = false;
        }
        else if(motorEncendido == false){
            motorEncendido = true; 
        }
    }
    public void gestionarWifi(){
        if(motorEncendido == true){
            if(wifiEncendido == true){
                wifiEncendido = false;
            }
            else if(wifiEncendido == false){
                wifiEncendido = true;
            }
        }
    }
    public void gestionarMarcha(){
        if(motorEncendido == true && puertaAbierta == false){
            if(enMarcha == true){
                enMarcha = false;
            }
            else if(enMarcha == false){
                enMarcha = true; 
            }
        }
    }
    public void moverDerecha(double d){
        if(enMarcha == true){ 
        localizacionX += d;
        }
    }
    public void moverIzquierda(double d){
        if(enMarcha == true){ 
        localizacionX -= d;
        }
    }
    public void moverArriba(double d){
        if(enMarcha == true){ 
        localizacionY += d;
        }
    }
    public void moverAbajo(double d){
        if(enMarcha == true){ 
        localizacionY -= d;
        }
    }

    //=== === ===Inserte acá los SETTERS Y GETTERS=== === ===
    public String getNombreConductor(){
        return nombreConductor;
    }
    public void setNombreConductor(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }
    //////////////////////////////////////////////////////////
    public int getnPasajeros(){
        return nPasajeros;
    }
    public void setnPasajeros(int nPasajeros){
        this.nPasajeros = nPasajeros;
    }
    ////////////////////////////////////////////////////////
    public double getCantidadDinero(){
        return cantidadDinero;
    }
    public void setCantidadDinero(double cantidadDinero){
        this.cantidadDinero = cantidadDinero;
    }
    ///////////////////////////////////////////////////////
    public int getnMaximoPasajeros(){
        return nMaxPasajeros;
    }
    public void setnMaximoPasajeros(int nMaxPasajeros){
        this.nMaxPasajeros = nMaxPasajeros;
    }
    /////////////////////////////////////////////////
    public double getLocalizacionX(){
        return localizacionX;
    }
    public void setLocalizacionX(double localizacionX){
        this.localizacionX = localizacionX;
    }
    ///////////////////////////////////////////////////
    public double getLocalizacionY(){
        return localizacionY;
    }
    public void setLocalizacionY(double localizacionY){
        this.localizacionY = localizacionY;
    }
    ////////////////////////////////////////////////
    public boolean isPuertaAbierta(){
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta){
        this.puertaAbierta = puertaAbierta;
    }
    /////////////////////////////////////////
    public boolean isAireAcondicionadoActivado(){
        return aireAcondicionadoActivado;
    }
    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado){
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }
    /////////////////////////////////////////////////////
    public boolean isMotorEncendido(){
        return motorEncendido;
    }
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    ///////////////////////////////////////////////////
    public boolean isWifiEncendido(){
        return wifiEncendido;
    }
    public void setWifiEncendido(boolean wifiEncendido){
        this.wifiEncendido = wifiEncendido;
    }
    ///////////////////////////////////////////////////
    public boolean isEnMarcha(){
        return enMarcha;
    }
    public void setEnMarcha(boolean enMarcha){
        this.enMarcha = enMarcha;
    }
    
}
// === === === === === === === === === === === === === === === === === === 
class Prueba {
    public static void main(String[] args) {
        Autobus camion1 = new Autobus("pee",30,false);
        camion1.gestionarPuerta();
        
    }
}
    
class Solutions {
    public static void main(String[] args){
        Autobus camion1 = new Autobus("Anderson",2,true);
        camion1.gestionarPuerta(); 
        camion1.recogerPasajero(1); 
        camion1.gestionarMarcha();
        camion1.moverArriba(10);
        camion1.gestionarPuerta();
        camion1.gestionarMarcha();
        camion1.moverIzquierda(10);
        camion1.moverArriba(3);
        // camion1.recogerPasajero(6);
        // camion1.moverIzquierda(3);
        // camion1.gestionarMarcha();
        // camion1.gestionarPuerta();
        // camion1.recogerPasajero(1);
        // camion1.recogerPasajero(4);
        // camion1.recogerPasajero(6);
        // camion1.gestionarWifi();
        // camion1.gestionarAireAcondicionado();
        // camion1.moverIzquierda(2);
        // camion1.dejarPasajero();
        // camion1.gestionarMotor();
        camion1.calcularDistanciaAcopio();
    }
}

