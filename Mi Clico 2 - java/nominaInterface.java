import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class nominaInterface extends JFrame implements ActionListener{
    public static void main(String[] args) {

        JFrame ventanaDePago = new JFrame("Nomina");
        ventanaDePago.setBounds(700,500,220,260); //(cordenada X,Cordenada Y,largo,ancho)tamaño de la ventana y Cordenada
        ventanaDePago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaDePago.setVisible(true);

        JLabel nombre = new JLabel("Nombre: ");
        JLabel codigo = new JLabel("Codigo: ");
        JLabel salario = new JLabel("Salario Base: ");
        JLabel salarioFinal = new JLabel("");

        JTextField textoNombre = new JTextField();
        JTextField textoCodigo = new JTextField();
        JSpinner textoSalario = new JSpinner();
        JTextField textoSalarioFinal = new JTextField();

        JPanel panel = new JPanel ();
        GridLayout gl = new GridLayout(4,2);
        panel.setLayout(gl);

        panel.add(nombre);
        panel.add(textoNombre);
        panel.add(codigo);
        panel.add(textoCodigo);
        panel.add(salario);
        panel.add(textoSalario);
        



        JButton calcular = new JButton("Calcular");
        panel.add(calcular);
        panel.add(salarioFinal);


        ActionListener oyente = new ActionListener(){
            @override
            public void actionPerformed(ActionEvent e) {
                salarioFinal.setText("Res: "+ textoSalario);
                
                

            }
        };
        calcular.addActionListener(oyente);
        

        

        ventanaDePago.add(panel);
        // ventanaDePago.pack(); //CALCULA EL TAMAÑO DE LA VENTANA AUTOMATICAMENTE
        ventanaDePago.setVisible(true);
    }
}
