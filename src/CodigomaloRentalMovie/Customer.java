/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigomaloRentalMovie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */

public class Customer {
// mutable class
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name) {
        _name = name;
        _rentals = new ArrayList<Rental>();
    }
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }
    /*
    El metodo Statement contiene las declaraciones de renta de Movies para diferentes tipos, precios, puntos frecuentes de rentas...... 
    ...................................................................................................................................
    */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPionts = 0;
        Iterator<Rental> rentals = _rentals.iterator();
        String result = "Rental Record for "+ getName()+"\n";
        while (rentals.hasNext()) {
        // process current rental
        double thisAmount = 0; // amount for this rental
        Rental each = rentals.next();
        // Next, compute amount due for current rental (each)
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
            thisAmount += 2;
            if (each.getDaysRented() > 2)
            thisAmount += (each.getDaysRented()-2)*1.5;
            break;
            case Movie.NEW_RELEASE:
            thisAmount += each.getDaysRented()*3;
            break;
            case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (each.getDaysRented() > 3)
            thisAmount += (each.getDaysRented()-3)*1.5;
            break;
        } // end of switch statement
        // add frequent renter points contributed by current rental
        frequentRenterPionts++;
        if ((each.getMovie().getPriceCode() ==  Movie.NEW_RELEASE) && each.getDaysRented() > 1)
            frequentRenterPionts++;
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        totalAmount += thisAmount;
        } // end of the while loop over the _rentals
        // add totalAmount and freuentRenterPoints to result String
        return result; // Finally DONE!
        } // end of method statement()
}
