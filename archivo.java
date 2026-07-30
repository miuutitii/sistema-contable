import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Formulario");
        ventana.setSize(300, 250);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Etiquetas
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 60, 80, 25);

        // Campos de texto
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 150, 25);

        JTextField txtEdad = new JTextField();
        txtEdad.setBounds(100, 60, 150, 25);

        // Botón
        JButton btnMostrar = new JButton("Mostrar datos");
        btnMostrar.setBounds(70, 100, 150, 30);

        // Resultado
        JLabel lblResultado = new JLabel("");
        lblResultado.setBounds(20, 150, 250, 25);

        // Evento del botón
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nombre = txtNombre.getText();
                String edad = txtEdad.getText();

                lblResultado.setText("Hola " + nombre + ", tienes " + edad + " años.");
            }
        });

        // Agregar componentes
        ventana.add(lblNombre);
        ventana.add(lblEdad);
        ventana.add(txtNombre);
        ventana.add(txtEdad);
        ventana.add(btnMostrar);
        ventana.add(lblResultado);

        ventana.setVisible(true);
    }
}