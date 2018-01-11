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
public class Regular extends Price{
    
    public Regular(int _priceCode) {
        super(_priceCode);
    }
    
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
        result += (daysRented - 2)*1.5;
        return result;
    }
    
    
}
