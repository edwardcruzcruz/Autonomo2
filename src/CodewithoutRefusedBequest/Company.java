/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodewithoutRefusedBequest;

/**
 *
 * @author User
 */
public class Company {
    
    private Government gobierno;

    public Government getGobierno() {
        return gobierno;
    }

    public void setGobierno(Government gobierno) {
        this.gobierno = gobierno;
    }
    public double getTax(Government gobierno) {
        double tax = computeInitialTax();
        return gobierno.addPersonalTax(tax);
    }

    private double computeInitialTax() {
        return 2.1;
    }
    
}
