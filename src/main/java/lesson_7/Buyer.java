package lesson_7;

import java.util.HashMap;
import java.util.Random;

public class Buyer implements IBuyer, IUseBasket{

    Basket basket;
    @Override
    public void enterToMarket() {
        System.out.println(Thread.currentThread().getName() + ": entered market.");
    }

    @Override
    public void chooseGoods() {
        try{
            Random random = new Random();
            for(int i = 0; i < random.nextInt(4); i++) {
                Thread.currentThread().sleep(random.nextInt(1500) + 500);
                putGoodsToBasket();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void goOut() {
        System.out.println(Thread.currentThread().getName() + ": left market.");
    }

    @Override
    public void takeBasket() {
        this.basket = new Basket();
    }

    @Override
    public void putGoodsToBasket() {
        if(basket == null){
            System.out.println("Take basket first!");
        }
        Random random = new Random();
        Item item = Runner.goods.get(random.nextInt(Runner.goods.size()));
        basket.addItem(item);
        System.out.println(Thread.currentThread().getName() + ": Put " + item.getName() + " in basket.");
    }

    class Basket {
        private long totalPrice = 0;
        private HashMap<String, Integer> goods = new HashMap<>();

        public void addItem(Item item){
            goods.computeIfPresent(item.getName(), (k, v) -> v+= item.getPrice());
            totalPrice += item.getPrice();
        }
    }
}
