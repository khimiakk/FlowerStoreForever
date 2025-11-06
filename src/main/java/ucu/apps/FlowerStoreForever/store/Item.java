package ucu.apps.FlowerStoreForever.store;

import lombok.Getter;

@Getter
public abstract class Item {

    private String description;

    public abstract double price();

}