package pracs.chapter01;

/**
 * 影片类，用于装电影数据
 *
 * @author yyh
 */
public class Movie {

    /**
     * 用户为小孩，数量为2
     */
    public static final int CHILDRENS = 2;

    /**
     * 规律
     */
    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;

    private String _title;

    private int _priceCode;

    public Movie() {
    }

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }
}
