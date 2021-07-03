package pracs.chapter01.ver01;

/**
 * 租赁类，表示某个顾客租了一部影片
 *
 * @author yyh
 */
public class Rental {


    /**
     * 租赁的影片
     */
    private Movie _movie;

    /**
     * 租赁天数
     */
    private int _daysRented;

    public Rental() {
    }

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }
}
