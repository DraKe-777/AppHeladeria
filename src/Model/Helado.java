package Model;

public class Helado extends Producto{

    public Helado(int id, String nombre, double precio, int stock) {
        super(id, nombre, precio,"Helado", stock);

    }

    @Override
    public String toString() {
        return "Helado [ID=" + getId() +
                ", Sabor='" + getNombre() + '\'' +
                ", Precio=" + getPrecio() +
                ", Categoria=" + getCategoria() + ']';
    }
}
