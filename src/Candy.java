/**
 * Name: Austin Preston
 * Section: 003
 * Email: apreston3@unm.edu
 * Date: February 20, 2021
 * Function: A silly little bit of code that calculates the prices for
 * specific desserts
 */

public class Candy extends Dessert {

    double weight;
    double price;

    /**
     * Constructs a new dessert item.
     *
     * @param name Name of the dessert.
     */
    public Candy(String name, double weightInPounds, double pricePerPound) {
        super(name);
        weight = weightInPounds;
        price = pricePerPound;
    }

    @Override
    public double getPrice() {
        return price * weight;
    }

    public double getWeightInPounds() {
        return weight;
    }

    public double getPricePerPound() {
        return price;
    }
}
