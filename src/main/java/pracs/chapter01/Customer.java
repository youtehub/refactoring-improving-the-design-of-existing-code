package pracs.chapter01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 租赁类，顾客租赁一部影片
 *
 * @author yyh
 */
public class Customer {

    private String _name;

    private Vector _rentals = new Vector();

    public Customer() {
    }

    public Customer(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    /**
     * 租赁一部影片,生成详单
     *
     * @param rental
     */
    public void addRental(Rental rental) {
        _rentals.addElement(rental);
    }


    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line

            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += 2;
                    }
                    break;


            }
            return null;
        }
        return null;
    }

}
