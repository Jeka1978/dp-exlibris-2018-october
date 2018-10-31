package com.exlibris.contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {

    {

    }
    public Son() {
        super(12);
        System.out.println(123);
        System.out.println(123);
    }
}
