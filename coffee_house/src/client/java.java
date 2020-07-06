package client;

import CoffeeShop.coffeehouse;
import customers.customer;

class CoffeeShop {
    public static void main(String args[]){
        customer robert = new customer("Adam", "Black Coffee");
        coffeehouse burista = new coffeehouse();
        burista.Order(robert);
        burista.prepareDrink("French Vanilla");
        burista.callOutCompletedOrders();
    }

}
