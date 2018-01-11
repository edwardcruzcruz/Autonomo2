/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigomaloRentalMovie;

/**
 *
 * @author User
 */
public class Rental {
// an immutable class
    private Movie _movie;
    private int _daysRented;
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    public Movie getMovie() {
        return _movie;
    }
    public int getDaysRented() {
        return _daysRented;
    }
}
