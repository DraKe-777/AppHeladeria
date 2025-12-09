package Model;

public class ItemPedido {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public ItemPedido(int cantidad, Producto producto, double subtotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = producto.getPrecio()*cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = this.producto.getPrecio() * this.cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "Producto=" + producto.getNombre() +
                ", Cantidad=" + cantidad +
                ", Subtotal=" + subtotal +
                '}';
    }
}
