package lesson_7;

import java.util.HashMap;

public class Basket {
    private long totalPrice = 0;
    private HashMap<String, Integer> goods = new HashMap<>();

    public void addItem(Item item){
        goods.computeIfPresent(item.getName(), (k, v) -> v+= item.getPrice());
        totalPrice += item.getPrice();
    }
}
