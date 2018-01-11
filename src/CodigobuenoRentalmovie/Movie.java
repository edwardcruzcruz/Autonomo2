/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigobuenoRentalMovie;

/**
 *
 * @author User
 */
public class Movie {
// immutable class!
    
    private String _title;
    private Price _price;
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private int _daysRented;
    public Movie(String title, Price priceCode) {
        _title = title;
        _price = priceCode;
    }
    public String getTitle() {
        return _title;
    }
    double getCharge() {
        return _price.getCharge(_price);
    }
    public int getPriceCode() {
        return _price;
    }
    
    
    public int getDaysRented() {
        return _daysRented;
    }
    void setPriceCode(int arg) {
        switch (arg) {
        case REGULAR: 
            _price = new Regular();
            break;
        case CHILDRENS: 
            _price = new Childrens();
            break;
        case NEW_RELEASE: 
            _price = new NewRelease();
            break;
        } 
    
    }
}

