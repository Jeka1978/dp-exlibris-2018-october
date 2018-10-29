package com.exlibris.house_made_singletons;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class TaxCalculator2 {

    private MaamResolver2 maamResolver;

    public double withMaam(double price) {
        double maam = maamResolver.getMaam();
        return price * maam+price;
    }


}
