package customers;

public class customer implements Waiting {
    private String name;
    private String drink;

    public customer(String name, String drink) {
        this.name = name;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void orderReady(String completedDrink) {
        if (drink.equals(completedDrink))
            finisher();
    }

    private void finisher() {
        System.out.println(name + drink);
    }
}
