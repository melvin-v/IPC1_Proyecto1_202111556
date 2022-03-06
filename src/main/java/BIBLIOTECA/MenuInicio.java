package BIBLIOTECA;

import javax.swing.*;
import java.awt.*;

public class MenuInicio extends JFrame{
    private JPanel root = new JPanel();;
    public MenuInicio(){
        iniciarComponentes();
        setSize(800, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("BIBLIOTECA FACULTAD DE INGENIERIA USAC");

    }

    private void iniciarComponentes(){
        root();
        Imagenes();
        componentes();
    }

    private void root(){
        this.getContentPane().add(root);
        root.setLayout(null);
    }

    private void Imagenes(){
        ImageIcon imagen = new ImageIcon("user_icon.png");
        JLabel user_icon = new JLabel(imagen);
        user_icon.setBounds(355, 20, 100,100);
        user_icon.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        root.add(user_icon);

        ImageIcon imagen2 = new ImageIcon("logo.png");
        JLabel logo = new JLabel(imagen2);
        logo.setBounds(20, 200, 350,150);
        logo.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(350, 150, Image.SCALE_SMOOTH)));
        root.add(logo);

    }

    private void componentes(){

        JButton botonLogin = new JButton("Login");
        botonLogin.setBounds(345,130, 120,50);
        root.add(botonLogin);

        JLabel vision = new JLabel("Vision");
        vision.setBounds(450, 240, 50, 30);
        root.add(vision);

        JLabel texto1 = new JLabel("Ser la unidad tecnica de informacion especializada y tecnica, ");
        texto1.setBounds(450, 250, 400, 50);
        texto1.setFont(new Font("arial",Font.ITALIC, 10));
        root.add(texto1);

        JLabel texto2 = new JLabel("con estandares de bilblioteca universitaria en beneficio ");
        texto2.setBounds(450, 260, 400, 50);
        texto2.setFont(new Font("arial",Font.ITALIC, 10));
        root.add(texto2);

        JLabel texto3 = new JLabel("del desarrollo de la ciencia y la tecnologia en el pais. ");
        texto3.setBounds(450, 270, 400, 50);
        texto3.setFont(new Font("arial",Font.ITALIC, 10));
        root.add(texto3);

        JButton botonAbout = new JButton("About");
        botonAbout.setBounds(100,350, 120,50);
        root.add(botonAbout);

    }

}
