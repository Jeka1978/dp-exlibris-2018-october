package com.exlibris.java8.home_work;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0,10000),MIDDLE(10001,20000),SENIOUR(20001,Integer.MAX_VALUE);
    private int min;
    private int max;



}
