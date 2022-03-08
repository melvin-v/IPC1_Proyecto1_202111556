package BIBLIOTECA;

public class AtributosUsuarios{
    private static Usuario[] usuario = new Usuario[100];
    private static int contador = 1;

    public AtributosUsuarios(Usuario a){
        colocarUsuario(a);
    }

    public static void colocarUsuario(Usuario nUsuario) {
        for(int i = 0; i < usuario.length; i++) {
            if(usuario[i] == null) {
                usuario[i] = nUsuario;
                contador++; //Incrementar la cantidad de comics con cada Comic agregado
                return;
            }
        }
    }

    public String getId(int i) {
        return usuario[i].getId();
    }

    public void setId(int i, String id) {
        this.usuario[i].setId(id);
    }

    public String getNombre(int i) {
        return usuario[i].getNombre();
    }

    public void setNombre(int i, String nombre) {
        this.usuario[i].setNombre(nombre);
    }

    public String getApellido(int i) {
        return usuario[i].getApellido();
    }

    public void setApellido(int i, String apellido) {
        this.usuario[i].setApellido(apellido);
    }

    public String getUsuario(int i) {
        return usuario[i].getUsuario();
    }

    public void setUsuario(int i, String usuario) {
        this.usuario[i].setUsuario(usuario);
    }

    public String getRol(int i) {
        return usuario[i].getRol();
    }

    public void setRol(int i, String rol) {
        this.usuario[i].setRol(rol);
    }

    public String getContraseña(int i) {
        return usuario[i].getContraseña();
    }

    public void setContraseña(int i, String contraseña) {
        this.usuario[i].setContraseña(contraseña);
    }

}
