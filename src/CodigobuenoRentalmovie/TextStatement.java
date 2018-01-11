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
public class TextStatement extends Statement{

    
    
    @Override
    String headerString(Customer c) {
        return "hace algo";
    }

    @Override
    String eachRentalString(Rental each) {
        return "hace algo";
    }

    @Override
    String footerString(Customer c) {
        return "hace algo";
    }
    
}
