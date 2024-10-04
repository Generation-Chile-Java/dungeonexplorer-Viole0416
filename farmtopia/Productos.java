package farmtopia;

import farmtopia.salas.Mercado;

public class Productos extends Mercado {
    protected String nombreProducto;
    protected int cantidad;
    protected double precio;

    public Productos(String nombreProducto, int cantidad, double precio) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void venderProducto(Player player) {
player.aumentarPuntaje(10); // suma puntaje al vender productos
        double totalVenta = (cantidad > 0)
                ? (cantidad * precio) : 0;

        String mensaje = (cantidad > 0)
                ? "Has vendido " + cantidad + " unidades de " + nombreProducto + " por $" + totalVenta
                : "No tienes suficiente " + nombreProducto + " para vender.";

        System.out.println(mensaje);

// Si se vendieron productos, vaciar el stock
        if (cantidad > 0) {
            cantidad = 0; // Después de vender, se vacía el stock.

        }
    }
}
