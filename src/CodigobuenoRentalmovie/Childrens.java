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
public class Childrens extends Price{

    public Childrens(int _priceCode) {
        super(_priceCode);
    }
    double getCharge(int daysRented) {
        double result = 3;
        if (daysRented > 3)
        result += (daysRented - 3)*1.5;
        return result;
    }
}
