import javax.swing.*;
import java.awt.*;

public class InterfacesGrficasSEMANA4 { // Interfaces GRAFICAS
    public static void main(String[] args) {
        //CREAR VENTASNAS

        JFrame ventana = new JFrame("Titulo de la Ventana"); // constructor de la ventana 
        ventana.setSize(600, 300); //tamaño de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        //COMPONENTES DE LA VENTANA
        JButton nuevoBoton = new JButton("cancelar");
        JTextField cuadroTetxto = new JTextField("cuadro texto");
        JLabel label = new JLabel("Nombre");
        //label.setText("hola");


        //CONTENEDER DE LOS COMPONENETES
        JPanel panel = new JPanel();

        panel.add(nuevoBoton);
        panel.add(cuadroTetxto);
        panel.add(label);

        //agregar el panel ya con los componentes a la Ventana
        ventana.setContentPane(panel);
        ventana.setVisible(true);




    }
}

class VentanaTriangulo{
    public static void main (String[] args) {
        //Constructor de Ventana PRINCIPAL
        JFrame ventanaT = new JFrame("Calculadora De Triangulos");
        // Contenedor(JPanel)
        JPanel panel = new JPanel();
        //Crear Elementos Grficos(Botones Entradas De TEXTO, Y LABELS)
        JLabel lado1 = new JLabel("Lado 1");
        JLabel lado2 = new JLabel("Lado 1");
        JLabel lado3 = new JLabel("Lado 1");

        JTextField textoLado1 = new JTextField();
        JTextField text0Lado2 = new JTextField();
        JTextField textoLado3 = new JTextField();

        JLabel area = new JLabel("Area");
        JLabel perimetro = new JLabel("Permetro");

        JTextField textArea = new JTextField();
        JTextField textPerimetro = new JTextField();

        JButton calculador = new JButton("Calcular");

        // calculador.addActionListener((ActionEvent e)  {
        //     String l1 = textoLado1.getText();
        //     String l2 = textoLado1.getText();
        //     String l3 = textoLado1.getText();

        //     double lado11 = Double.parseDouble(l1);
        //     double lado22 = Double.parseDouble(l2);
        //     double lado33 = Double.parseDouble(l3);

        //     double resPerimetro = lado11+lado22+lado33;
        //     double resArea = 1000;
        // });
        
        //Asociar Layout manager al panle
        GridLayout layout = new GridLayout(6,2);
        panel.setLayout(layout);


        //Agregar Elementos al contenedor
        panel.add(lado1);
        panel.add(lado2);
        panel.add(lado3);
        panel.add(area);
        panel.add(perimetro);
        panel.add(calculador);

        //Asociar contenedor a la Ventana
        ventanaT.setContentPane(panel);

        //Definir Accion De Cierre
        ventanaT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaT.setSize(300,400);

        //Hacer Visible La Ventana
        ventanaT.pack();
        ventanaT.setVisible(true);
    
    }
}
