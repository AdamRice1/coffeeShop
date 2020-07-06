package CoffeeShop;

import customers.customer;

import java.util.ArrayList;
import java.util.List;

public class coffeehouse {

    private List<customer> customersList;
    private List<String> completedDrinks;

    public coffeehouse() {
        customersList = new ArrayList<customer>();
        completedDrinks = new ArrayList<String>();
    }

    public void Order(customer customer) {
        customersList.add(customer);
        System.out.println(customer.getName() + "we are here"
                + customer.getDrink());
    }

    public void prepareDrink(String drinkToBePrepared) {
        double timeTaken = Math.random()* 2;
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drinkToBePrepared);
        } catch (InterruptedException e) {
            System.out.println("You ordered a dumb drink.");
        }
    }

    public void callOutCompletedOrders() {
        for (String readyDrink : completedDrinks) {
            System.out.println("Drink Ready!" + readyDrink);
            for (customer customer : customersList) {
                customer.orderReady(readyDrink);
            }
        }
    }



}
