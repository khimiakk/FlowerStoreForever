package ucu.apps.flowerstoreforever.store;

import lombok.Getter;

@Getter
public abstract class Item {

    private String description;

    public abstract double price();

}