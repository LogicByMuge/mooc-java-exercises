package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    public void add(String product, int price) {
      if(!products.containsKey(product)) {
          Item item = new Item(product,0,price);
          products.put(product,item);
      }
      products.get(product).increaseQuantity();
    }

    public int price() {
        int currentPrice = 0;
        for(Item item : products.values()) {
            currentPrice += item.price();
        }
        return currentPrice;
    }

    public void print() {
        for(String key : products.keySet()) {
            System.out.println(products.get(key));
        }
    }
}
