package BIBLIOTECA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministradorPanel extends JFrame {
    JPanel root = new JPanel();
    boolean visibilidadAdmin = false;

    public AdministradorPanel(){
        iniciarComponentes();
        setSize(800, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMINISTRADOR");
    }

    public void iniciarComponentes(){
        imagenes();
        root();
        componentes();
    }

    private void root(){
        this.getContentPane().add(root);
        root.setLayout(null);
    }

    public void imagenes(){
        ImageIcon imagen = new ImageIcon("imagenes/user_icon.png");
        JLabel user_icon = new JLabel(imagen);
        user_icon.setBounds(475, 20, 75,75);
        user_icon.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
        root.add(user_icon);

        ImageIcon imagen2 = new ImageIcon("imagenes/logo.png");
        JLabel logo = new JLabel(imagen2);
        logo.setBounds(20, 10, 350,150);
        logo.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(350, 150, Image.SCALE_SMOOTH)));
        root.add(logo);
    }

    public void componentes(){
        JButton botonLogout = new JButton("Logout");
        botonLogout.setBounds(600,30, 100,50);
        root.add(botonLogout);

        JLabel vision = new JLabel("Usuarios");
        vision.setBounds(140, 200, 70, 30);
        root.add(vision);

        JButton botonCrear = new JButton("Crear");
        botonCrear.setBounds(50,250, 100,50);
        root.add(botonCrear);

        JButton botonVer = new JButton("Ver");
        botonVer.setBounds(175,250, 100,50);
        root.add(botonVer);

        JButton botonModificar = new JButton("Modificar");
        botonModificar.setBounds(50,325, 100,50);
        root.add(botonModificar);

        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(175,325, 100,50);
        root.add(botonEliminar);

        JLabel reportes = new JLabel("Reportes");
        reportes.setBounds(550, 110, 70, 30);
        root.add(reportes);

        JButton botonUsuarios = new JButton("Usuarios");
        botonUsuarios.setBounds(400,150, 100,50);
        root.add(botonUsuarios);

        JButton botonBiblio = new JButton("Bibliografias");
        botonBiblio.setBounds(525,150, 120,50);
        root.add(botonBiblio);

        JButton botonPrestamo = new JButton("Prestamo");
        botonPrestamo.setBounds(675,150, 100,50);
        root.add(botonPrestamo);

        JLabel bibliografia = new JLabel("Bibliografia");
        bibliografia.setBounds(550, 220, 70, 30);
        root.add(bibliografia);

        JButton botonBCrear = new JButton("Crear");
        botonBCrear.setBounds(450,270, 100,50);
        root.add(botonBCrear);

        JButton botonBVer = new JButton("Ver");
        botonBVer.setBounds(600,270, 100,50);
        root.add(botonBVer);

        JButton botonBModificar = new JButton("Modificar");
        botonBModificar.setBounds(450,350, 100,50);
        root.add(botonBModificar);

        JButton botonBEliminar = new JButton("Eliminar");
        botonBEliminar.setBounds(600,350, 100,50);
        root.add(botonBEliminar);


        botonLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickLogout(e);
            }
        });

    }

    private void clickLogout(ActionEvent e){
        this.visibilidadAdmin = true;
        if (visibilidadAdmin){
        System.out.println("si");}
    }

}
