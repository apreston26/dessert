/**
 * Name: Austin Preston
 * Section: 003
 * Email: apreston3@unm.edu
 * Date: February 20, 2021
 * Function: A silly little bit of code that calculates the prices for
 * specific desserts
 */

public class Cookie extends Dessert {

    int itemAmount;
    double price;

    /**
     * Constructs a new dessert item.
     *
     * @param name Name of the dessert.
     */
    public Cookie(String name, int itemCount, double pricePerDozen) {
        super(name);
        itemAmount = itemCount;
        price = pricePerDozen;

    }

    @Override
    public double getPrice() {
        return (price / 12) * itemAmount;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public double getPricePerDozen() {
        return price;
    }
}
