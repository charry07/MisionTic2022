public abstract class Vehiculo {
    //Inserte acá los atributos
    String nombreConductor;
    int nPasajeros = 0;
    double cantidadDinero = 0;
    int nMaxPasajeros;
    double localizacionX = 0;
    double localizacionY = 0;
    boolean aireAcondicionadoActivado = false;
    boolean motorEncendido = false;
    boolean wifiEncendido = false;
    boolean enMarcha = false;
    public Object vehiculo;
    
    
    
    //Inserte acá el método constructor
    public Vehiculo(String nombreConductor,int nMaxPasajeros){
        this.nombreConductor = nombreConductor;
        this.nMaxPasajeros = nMaxPasajeros;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    

    public void dejarPasajero(){
        if(enMarcha == false ){
            nPasajeros -= 1;
        }
    }
    public double calcularDistanciaAcopio(){
        double distanciaAcopio = Math.sqrt((Math.pow(localizacionX,2)) + (Math.pow(localizacionY,2)));
        return distanciaAcopio;
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
        if (motorEncendido == false){
            motorEncendido = true;
        }
        else{
            motorEncendido = false;
            aireAcondicionadoActivado = false;
            wifiEncendido = false;
            enMarcha = false;
        }
        System.out.println("->motor: " + motorEncendido);
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
    public abstract void gestionarMarcha();
    
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
    
    
    //Inserte acá los SETTERS Y GETTERS
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