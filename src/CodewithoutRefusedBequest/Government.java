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
class Government {
    //solo ara ilustrar ejemplo son los valores de retorno
    protected double computeBaseTax() { //... 
        return 2.1;
    }
    //solo ara ilustrar ejemplo son los valores de retorno
    protected double addPersonalTax(double tax) { 
        return (2.5*tax);
    }

    public double getTax() {
        double tax = computeBaseTax();
        return addPersonalTax(tax);
    }
}
