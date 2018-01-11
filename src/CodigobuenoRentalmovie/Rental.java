/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigobuenoRentalMovie;

/**
 *
 * @author User
 */
public class Rental {
// an immutable class
    private Movie _movie;
    private int frequentRenterPoints;
    public Rental(Movie movie) {
        _movie = movie;
    }
    public Movie getMovie() {
        return _movie;
    }
    
    double getCharge() {
        return _movie.getCharge();
    }
    
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }

    
    
}
