package com.kypnicholas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nkypr on 10/08/2017.
 */
public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;         //This list will help us store the item alongside the quantity that the customer added to his basket

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {                              //Check that is valid item with quantity > 0
            int inBasket = list.getOrDefault(item, 0);          //check if we already have the item in the basket
            int newQuantity = inBasket - quantity;                          //Calculate the newQuantity of goods in stock

            if(newQuantity > 0) {                                           //If newQuantity of goods is stock is greater than zero, put the item to the basket
                list.put(item, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {                                   //If newQuantity of goods is stock is equal to zero then we want to remove the item from the basket
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket() {
        this.list.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {                    //Loop through all the entries in the Mpa
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }

}
