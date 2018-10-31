package com.exlibris.my_spring;

/**
 * @author Evgeny Borisov
 */
public class ExlibriesServiceImpl implements ExlibriesService {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is the best");
    }
}
