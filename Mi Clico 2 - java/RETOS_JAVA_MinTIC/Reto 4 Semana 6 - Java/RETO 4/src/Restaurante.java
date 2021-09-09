//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

public class Restaurante {
    //Inserte acá los atributos
    public ArrayList<Pedido> pedidos;
    

    //Inserte acá el método constructor

    public Restaurante() {
        this.pedidos = new ArrayList<Pedido>();
    }


    //Inserte acá los SETTERS Y GETTERS
    public void agregarPedidoLista(Pedido pedido) {
        pedidos.add(pedido);

    }
    public void eliminarPedido(String nPedido){
        for(int i=0;i<pedidos.size();i++){
            if (pedidos.get(i).getnPedido().equals(nPedido)){
                pedidos.remove(i);
            }
        }
    }

    public double calcularGanancias(){ 
        double ganancias = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            ganancias +=pedidos.get(i).getCostoPedido();
        }
        return ganancias;
    }
    public double promedioGananciasTotales(){
        double promedio = 0 ; 
        promedio = calcularGanancias()/pedidos.size();
        return promedio;
    }
    public double desviacionEstandarGananciasTotales() {
        double promedio = promedioGananciasTotales();
        double desviacion = 0;
        desviacion = pedidos.stream().map((a) -> Math.pow((a.getCostoPedido()-promedio),2)).reduce(desviacion, (accumulator, _item) -> accumulator + _item);
        return Math.sqrt(desviacion/pedidos.size());
    }
    public double retornarCostoPedido(String ID){
        double costo = 0;
        for (int i = 0; i < this.pedidos.size(); ++i) {
            if (this.pedidos.get(i).getnPedido() == ID) {
                costo = this.pedidos.get(i).getCostoPedido();
            }
        }
        return costo;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}