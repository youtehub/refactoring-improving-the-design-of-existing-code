package pracs.chapter01.ver04;

import org.testng.annotations.Test;

public class CustomerTest {

    @Test
    public void statement01() {
        Movie movie = new Movie("A Dog's Way Home", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 7);

        Customer customer = new Customer("Tom");
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }

    @Test
    public void statement02() {
        Movie movie = new Movie("Boss Level", Movie.REGULAR);
        Rental rental = new Rental(movie, 7);

        Customer customer = new Customer("William");
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }

    @Test
    public void statement03() {
        Movie movie = new Movie("Titanic", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 7);

        Customer customer = new Customer("Audrey");
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }

}
