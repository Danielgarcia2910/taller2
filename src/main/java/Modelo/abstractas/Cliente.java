package modelo.tiendaaccesorios;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends usuario {
    private String direccion;
    private String telefono;
    private Carrito carrito;
    private List<Pedido> historialPedidos;

    
    public Cliente(String nombre, String correo, String contrasena,
                   String direccion, String telefono) {
        super(nombre, correo, contrasena);
        this.direccion = direccion;
        this.telefono = telefono;
        this.carrito = new Carrito(this);
        this.historialPedidos = new ArrayList<>();
    }

    public String getDireccion()              { return direccion; }
    public String getTelefono()               { return telefono; }
    public Carrito getCarrito()               { return carrito; }
    public List<Pedido> getHistorialPedidos() { return historialPedidos; }

    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setTelefono(String telefono)   { this.telefono = telefono; }

    public void agregarPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }

    public void mostrarHistorial() {
        if (historialPedidos.isEmpty()) {
            System.out.println("  no tienes pedidos registrados.");
            return;
        }
        System.out.println("  === Historiallll de pedidos de " + nombre + " ===");
        for (Pedido p : historialPedidos) {
            System.out.println("  " + p);
        }
    }

    @Override
    public String getRol() { return "CLIENTE"; }

    @Override
    public String toString() {
        return super.toString() + " | Tel: " + telefono + " | Dir: " + direccion;
    }
}




