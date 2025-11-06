package ucu.apps.flowerstoreforever.decorators;

import ucu.apps.flowerstoreforever.store.Item;

public class BasketDecorator extends ItemDecorator {

    private static final double BASKETCOST = 4.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in a basket.";
    }

    @Override
    public double price() {
        return BASKETCOST + getItem().price();
    }
}
