package com.exlibris.house_made_singletons;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {
    public double withMaam(double price) {
        double maam = MaamResolver.getInstance().getMaam();
        return price * maam+price;
    }


}
