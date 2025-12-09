package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> items;
    private double total;

    public Pedido() {
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "items=" + items +
                ", total=" + total +
                '}';
    }
}
