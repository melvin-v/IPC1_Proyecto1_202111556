package BIBLIOTECA;

import javax.swing.*;
import java.awt.*;

public class MenuInicio extends JFrame{
    private JPanel root = new JPanel();;
    public MenuInicio(){
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear");
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        iniciarComponentes();
        setTitle("BIBLIOTECA FACULTAD DE INGENIERIA USAC");

    }

    private void iniciarComponentes(){
        root();
        Imagenes();
    }

    private void root(){
        this.getContentPane().add(root);
        root.setLayout(null);
    }

    private void Imagenes(){
        ImageIcon imagen = new ImageIcon("user_icon.png");
        JLabel user_icon = new JLabel(imagen);
        user_icon.setBounds(10, 10, 512,512);
        user_icon.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        root.add(user_icon);
    }

}
