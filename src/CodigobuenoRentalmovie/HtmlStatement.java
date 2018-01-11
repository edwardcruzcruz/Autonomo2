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
public class HtmlStatement extends Statement {
    @Override
    public String value(Customer c) {
        String result = "<H1>Rental Record for <EM>" + c.getName() +  "</EM><H1><P>\n";
        return super.value(c); //To change body of generated methods, choose Tools | Templates.
    }
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
