package com.exlibris.house_made_singletons;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorTest {

    @Test
    public void withMaam2() {


        MaamResolver2 mockMaamResolver = Mockito.mock(MaamResolver2.class);
        Mockito.when(mockMaamResolver.getMaam()).thenReturn(0.2);

        TaxCalculator2 taxCalculator = new TaxCalculator2(mockMaamResolver);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(120,withMaam,0.000001);
    }


    @Test
    public void withMaam() {
        TaxCalculator taxCalculator = new TaxCalculator();
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(117,withMaam,0.000001);
    }
}






