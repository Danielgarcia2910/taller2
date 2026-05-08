package modelo.tiendaaccesorios;

/**
 *
 * @author Orly02
 */
import modelo.excepciones.CarritoVacioException;
import java.util.ArrayList;
import modelo.excepciones.ProductoNoEncontradoException;

public class Administrador extends usuario {

    public Administrador(int id, String nombre,
                         String correo, String contraseña) {

        super(id, nombre, correo, contraseña);
    }

    @Override
    public void mostrarRol() {
        System.out.println("rol de Administrador");
    }

    public void agregarProducto(ArrayList<Producto> inventario,
                                Producto producto) {

        inventario.add(producto);

        System.out.println("producto agregado correctamente");
    }

    public void eliminarProducto(ArrayList<Producto> inventario,Producto producto)
            throws ProductoNoEncontradoException {

        if (!inventario.contains(producto)) {

            throw new ProductoNoEncontradoException("producto no encontrado");
        }

        inventario.remove(producto);

        System.out.println("producto eliminado correctamente");
    }
}

