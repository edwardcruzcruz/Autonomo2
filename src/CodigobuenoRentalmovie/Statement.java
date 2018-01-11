/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigobuenoRentalmovie;

import java.util.Iterator;

/**
 *
 * @author User
 */
public abstract class Statement {
    
    public String value(Customer c) {
        Iterator<Rental> rentals = c.getRentals();
        String result = headerString(c);
        while (rentals.hasNext()) {
            Rental each = rentals.hasNext();
            result += eachRentalString(each);
        }
        result += footerString(c);
        return result;
    }
    abstract String headerString(Customer c);
    abstract String eachRentalString(Rental each);
    abstract String footerString(Customer c);
}
