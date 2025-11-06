package ucu.apps.FlowerStoreForever.store;

import java.util.ArrayList;
import java.util.List;

import ucu.apps.FlowerStoreForever.delivery.Delivery;
import ucu.apps.FlowerStoreForever.payment.Payment;

public class Order {

    private final List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public boolean processOrder() {
        if (payment == null) {
            return false;
        }

        double total = calculateTotalPrice();
        double deliveryCost = 0.0;
        if (delivery != null) {
            deliveryCost = delivery.deliver(items);
        }

        return payment.pay(total + deliveryCost);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}

