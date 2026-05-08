package modelo.tiendaaccesorios;

import modelo.excepciones.ProductoNoEncontradoException;
import java.util.ArrayList;

public class Administrador extends usuario {

    public Administrador(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
    }

    @Override
    public String getRol() 
    
    { return "ADMINISTRADOR"; }

    public void agregarProducto(ArrayList<Producto> inventario, Producto producto) {
        inventario.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    public void eliminarProducto(ArrayList<Producto> inventario, Producto producto)
            throws ProductoNoEncontradoException {
        if (!inventario.contains(producto)) {
            throw new ProductoNoEncontradoException("Producto no encontrado.");
        }
        inventario.remove(producto);
        System.out.println("Producto eliminado correctamente.");
    }
}
