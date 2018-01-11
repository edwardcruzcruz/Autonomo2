/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodewithRefusedBequest;

/**
 *
 * @author User
 */
public class Company implements Government{
    //este no necesita la clase company
    @Override
    public double computeBaseTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double addPersonalTax(double tax) {
        return 2.1;
    }

    @Override
    public double getTax() {
        double tax = computeInitialTax();
        return addPersonalTax(tax);
    }

    private double computeInitialTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
