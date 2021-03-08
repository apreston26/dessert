/**
 * Name: Austin Preston
 * Section: 003
 * Email: apreston3@unm.edu
 * Date: February 20, 2021
 * Function: A silly little bit of code that calculates the prices for
 * specific desserts
 */

public class IceCream extends Dessert {

     double price;

    /**
     * Constructs a new dessert item.
     *
     * @param name Name of the dessert.
     */
    public IceCream(String name, double priceOfIceCream) {
        super(name);
        price = priceOfIceCream;
    }

    @Override
    public double getPrice() {
        return price;
    }



}
