package modelo.tiendaaccesorios;


import java.util.ArrayList;
import modelo.excepciones.CarritoVacioException;
import modelo.excepciones.ProductoNoEncontradoException;


public class Carrito {

    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {

        productos.add(producto);

        System.out.println(
                producto.getNombre()+ " agregado al carrito");
    }

    public void eliminarProducto(Producto producto)
            throws ProductoNoEncontradoException {

        if (!productos.contains(producto)) {

            throw new ProductoNoEncontradoException("el producto no esta en el carrito");
        }

        productos.remove(producto);

        System.out.println(
                producto.getNombre()+ " eliminado del carrito");
    }

    public double calcularTotal()
            throws CarritoVacioException {

        if (productos.isEmpty()) {

            throw new CarritoVacioException("el carrito esta vacio");
        }

        double total = 0;

        for (Producto producto : productos) {

            total += producto.getPrecio();
        }

        return total;
    }

    public void mostrarCarrito()
            throws CarritoVacioException {

        if (productos.isEmpty()) {

            throw new CarritoVacioException("el carrito esta vacio");
        }

        System.out.println("===== CARRITO =====");

        for (Producto producto : productos) {

            System.out.println(producto.getNombre()+ " - $" + producto.getPrecio());
        }

        System.out.println("Total: $" + calcularTotal());
    }

    public void vaciarCarrito() {

        productos.clear();

        System.out.println("carrito vaciado");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}

