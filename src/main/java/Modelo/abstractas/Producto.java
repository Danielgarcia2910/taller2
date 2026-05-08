package modelo.tiendaaccesorios;

/**fghj
 *
 * @author Orly02
 */
import java.util.ArrayList;
import modelo.excepciones.CarritoVacioException;


public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private double total;

    public Pedido(int idPedido, Cliente cliente,
                  ArrayList<Producto> productos)
            throws CarritoVacioException {

        if (productos.isEmpty()) {
            throw new CarritoVacioException("no se puede crear un pedido vacío");
        }

        this.idPedido = idPedido;
        this.cliente = cliente;
        this.productos = productos;
        this.total = calcularTotal();
    }

    public double calcularTotal() {

        double suma = 0;

        for (Producto producto : productos) {
            suma += producto.getPrecio();
        }

        return suma;
    }

    public void mostrarPedido() {

        System.out.println("===== PEDIDO =====");
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Cliente: " + cliente.getNombre());

        System.out.println("Productos:");

        for (Producto producto : productos) {
            System.out.println(producto.getNombre()+ " - $" + producto.getPrecio());
        }

        System.out.println("Total: $" + total);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }
}


