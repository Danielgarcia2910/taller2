package modelo.tiendaaccesorios;

import modelo.excepciones.StockInsuficienteException;
import modelo.excepciones.CantidadInvalidaException;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private String tipo;

    public Producto(String nombre, double precio, int stock, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
    }

    public void comprar(int cantidad)
            throws StockInsuficienteException, CantidadInvalidaException {

        if (cantidad <= 0) {
            throw new CantidadInvalidaException(
                    "la cantidad debe ser mayor a 0");
        }

        if (cantidad > stock) {
            throw new StockInsuficienteException(
                    "no hay suficiente stock disponible");
        }

        stock -= cantidad;
    }

    public boolean disponible() {
        return stock > 0;
    }

    public void mostrarInformacion() {
        System.out.println("producto: " + nombre);
        System.out.println("tipo: " + tipo);
        System.out.println("precio: $" + precio);
        System.out.println("stock: " + stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
