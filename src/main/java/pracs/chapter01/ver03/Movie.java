package pracs.chapter01.ver03;

/**
 * 影片类，简单的纯数据类
 *
 * @author yyh
 */
public class Movie {

    /**
     * 儿童片价格
     */
    public static final int CHILDRENS = 2;

    /**
     * 普通片价格
     */
    public static final int REGULAR = 0;

    /**
     * 新片价格
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 标题
     */
    private String _title;

    /**
     * 价格
     */
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

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }
}
