package lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {

    public static List<Item> goods = new ArrayList<>(List.of(
            new Item("Milk", 90),
            new Item("Bread", 28),
            new Item("Eggs", 130),
            new Item("Sugar", 60),
            new Item("Butter", 140),
            new Item("Beer", 70)));

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 120; i++){
            Random random = new Random();
            int buyerCount = random.nextInt(2);
            for(int j = 0; j < buyerCount; j++){
                Thread thread = new Thread(() -> {
                    Buyer buyer = new Buyer();
                    buyer.enterToMarket();
                    buyer.takeBasket();
                    buyer.chooseGoods();
                    buyer.goOut();
                });
                thread.start();
            }
            Thread.sleep(1000);
        }
    }

}
