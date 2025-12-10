package Model;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private int id;
    private LocalDate fecha;
    private double totalFinal;
    private List<ItemPedido> itemsVendidos;

    public Venta(int id, Pedido pedido){
        this.id=id;
        this.fecha=LocalDate.now();
        this.totalFinal= pedido.getTotal();
        this.itemsVendidos=pedido.getItems();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public List<ItemPedido> getItemsVendidos() {
        return itemsVendidos;
    }

    public void setItemsVendidos(List<ItemPedido> itemsVendidos) {
        this.itemsVendidos = itemsVendidos;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", totalFinal=" + totalFinal +
                ", itemsVendidos=" + itemsVendidos.size() + "items"+
                '}';
    }
}
