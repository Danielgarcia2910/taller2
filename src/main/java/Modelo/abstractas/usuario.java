package modelo.tiendaaccesorios;

/**
 *hhfhfhssss
 * @author Orly02ddd
 */
public abstract class usuario {
    
    private int id;
    private String nombre;
    private String correo;
    private String contraseña;

    

    public usuario(int id, String nombre, String contraseña, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
    }
    
    
    public abstract String getRol1();
    
    public void mostrarInformacion(){
        
        System.out.println("ID "+ id);
        System.out.println("nombre"+ nombre);
        System.out.println("correo"+ correo);
        
    
        
        
}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
