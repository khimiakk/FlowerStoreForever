package ucu.apps.FlowerStoreForever.delivery;

import java.util.List;

import ucu.apps.FlowerStoreForever.store.Item;

public interface Delivery {
    double deliver(List<Item> items);
}