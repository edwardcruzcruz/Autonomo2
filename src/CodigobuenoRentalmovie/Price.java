/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigobuenoRentalmovie;

/**
 *
 * @author User
 */
public abstract class Price {
    private int _priceCode;
    
    

    public Price(int _priceCode) {
        this._priceCode = _priceCode;
    }

    int getPriceCode() {
        return _priceCode;
    } 
    
    
    abstract double getCharge(int daysRented) ; // now in Price…
    
    
}
