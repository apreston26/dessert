/**
 * Name: Austin Preston
 * Section: 003
 * Email: apreston3@unm.edu
 * Date: February 20, 2021
 * Function: A silly little bit of code that calculates the prices for
 * specific desserts
 */

public class Sundae extends IceCream {

    String name;
    double price;

    /**
     * Constructs a new dessert item.
     *
     * @param iceCreamName      Name of the dessert.
     * @param topping
     */
    public Sundae(IceCream iceCreamName, Dessert topping) {
        super(iceCreamName.name + " topped with " + topping.getName(), iceCreamName.getPrice());
//        name = iceCreamName.name
        price = iceCreamName.getPrice() + topping.getPrice();
    }



    @Override
    public double getPrice() {
        return price;
    }
}
