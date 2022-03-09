package BIBLIOTECA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog {
    private JPanel root = new JPanel();
    AtributosUsuarios user;
    String dato1 = "";
    boolean visibilidadMenu = false;

    public Login(Frame parent, boolean modal, AtributosUsuarios user) {
        super(parent, modal);
        iniciarComponentes();
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");
        this.user = user;
    }

    private void iniciarComponentes() {
        imagenes();
        componentes();
        root();
    }

    private void root() {
        this.getContentPane().add(root);
        root.setLayout(null);
    }

    private void imagenes() {
        ImageIcon imagen = new ImageIcon("imagenes/user_icon.png");
        JLabel user_icon = new JLabel(imagen);
        user_icon.setBounds(100, 20, 100, 100);
        user_icon.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        root.add(user_icon);
    }

    private void componentes() {
        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(50, 150, 50, 30);
        root.add(usuario);

        JTextField cajaUsuario = new JTextField();
        cajaUsuario.setBounds(150, 155, 100, 20);
        root.add(cajaUsuario);

        JLabel pass = new JLabel("Contraseña");
        pass.setBounds(50, 200, 100, 30);
        root.add(pass);

        JPasswordField cajaPass = new JPasswordField();
        cajaPass.setBounds(150, 205, 100, 20);
        root.add(cajaPass);

        JButton botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(30, 260, 100, 40);
        root.add(botonIngresar);


        JButton botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(160, 260, 100, 40);
        root.add(botonCancelar);

        botonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCancelar(e);
            }
        });

        botonIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dato1 = "";
                for(int i = 0; i<cajaPass.getPassword().length;i++){
                    dato1 += cajaPass.getPassword()[i];
                }
                clickIngresar(e, cajaUsuario.getText());
            }
        });

    }

    private void clickCancelar(ActionEvent e) {
        dispose();
    }

    private void clickIngresar(ActionEvent e, String a) {
        if (user.getUsuario(0).equals(a) & user.getContraseña(0).equals(dato1)){
            dispose();
            visibilidadMenu = true;
        }

    }
}
