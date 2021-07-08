package pracs.chapter01.ver05;

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

    /**
     * 原生的生产方法
     *
     * @return
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
            totalAmount += each.getCharge();
        }
        result += "Amount owed is " + totalAmount + "\n"
                + "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}


