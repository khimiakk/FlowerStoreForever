package ucu.apps.flowerstoreforever.delivery;

import java.util.List;

import ucu.apps.flowerstoreforever.store.Item;

public class PostDeliveryStrategy implements Delivery {

    private static final double MULTIPLIER = 0.05;

    @Override
    public double deliver(List<Item> items) {
        double sum = 0.0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum * MULTIPLIER;
    }

}
