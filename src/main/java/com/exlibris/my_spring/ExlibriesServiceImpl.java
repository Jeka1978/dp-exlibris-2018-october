package com.exlibris.my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class ExlibriesServiceImpl  {

    public void work() {
        System.out.println("Working...");
        drinkBeer();
    }

    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is the best");
    }
}
