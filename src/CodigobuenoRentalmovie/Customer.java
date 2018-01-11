/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigobuenoRentalMovie;

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
    private Statement state;
    private List<Rental> _rentals;
    public Customer (String name) {
        _name = name;
        _rentals = new ArrayList<Rental>();
    }

    public String getName() {
        return _name;
    }

}
