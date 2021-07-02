package pracs.chapter01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客类，拥有数据和相应的访问函数
 *
 * @author yyh
 */
public class Customer {

    /**
     * 姓名
     */
    private String _name;

    /**
     * 集合储存租赁的影片
     */
    private Vector _rentals = new Vector();

    public Customer() {
    }

    public Customer(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    /**
     * 添加需要租赁的影片
     *
     * @param rental 租赁类
     */
    public void addRental(Rental rental) {
        _rentals.addElement(rental);
    }

    public String statement() {
        //租赁费用
        double totalAmount = 0;
        //积分
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
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
                frequentRenterPoints++;
                //show figures for this rental
                result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
                totalAmount += thisAmount;
            }
            //add footer lines
            result += "Amount pwed is " + totalAmount + "\n"
                    + "You earned " + frequentRenterPoints + " frequent renter points";
        }

        return result;
    }
}


