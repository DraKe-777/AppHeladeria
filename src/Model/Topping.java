package Model;

public class Topping extends Producto{

    public Topping(int id, String nombre, double precio,int stock) {
        super(id, nombre, precio," Topping",stock);

    }
    @Override
    public String toString() {
        return "Topping [ID=" + getId() +
                ", Nombre='" + getNombre() + '\'' +
                ", Precio=" + getPrecio() +
                ", Categoria=" + getCategoria() +
                ", Stock=" + getStock() + ']';
    }
}
