package modelo.excepciones;

public class UsuarioNoValidoException extends Exception {

    public UsuarioNoValidoException(String mensaje) {
        super(mensaje);
    }
}

