package BIBLIOTECA;

public class Biblioteca {

    public static void main(String[] args) {
        Usuario a = new Usuario();
        AtributosUsuarios atributosUsuarios = new AtributosUsuarios(a);
        MenuInicio inicio = new MenuInicio(atributosUsuarios);

        AdministradorPanel adminPanel = new AdministradorPanel();
        do {


        if(inicio.visibilidad){
            adminPanel.setVisible(true);
            inicio.setVisible(false);
        }
        else{
        adminPanel.setVisible(false);
        inicio.setVisible(true);
        }}while(true);
    }





}
