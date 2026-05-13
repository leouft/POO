package entities;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double total = 0;

        for(int i = 0; i < items.size(); i++) {
            total += items.get(i).subTotal();
        }

        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String clientData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return String.format("%s (%s) - %s", client.getName(), sdf.format(client.getBirthDate()), client.getEmail());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (OrderItem item : items) {
            sb.append(item.getProduct().getName());
            sb.append(", $");
            sb.append(String.format("%.2f", item.getProduct().getPrice()));
            sb.append(", Quantity: ");
            sb.append(item.getQuantity());
            sb.append(", Subtotal: $");
            sb.append(String.format("%.2f", item.subTotal()));
            sb.append("\n");
        }

        return sb.toString();
    }
}
