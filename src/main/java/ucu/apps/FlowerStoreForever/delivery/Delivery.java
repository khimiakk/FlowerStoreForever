package ucu.apps.flowerstoreforever.delivery;

import java.util.List;

import ucu.apps.flowerstoreforever.store.Item;

public interface Delivery {
    double deliver(List<Item> items);
}