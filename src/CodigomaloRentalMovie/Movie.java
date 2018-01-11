/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigomaloRentalMovie;

/**
 *
 * @author User
 */
public class Movie {
// immutable class!
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    public String getTitle() {
        return _title;
    }
    public int getPriceCode() {
        return _priceCode;
    }
}

