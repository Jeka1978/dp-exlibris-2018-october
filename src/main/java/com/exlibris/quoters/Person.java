package com.exlibris.quoters;

import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Person {
    private String name;
    private String family;

    public Person(String שם, String משפחה) {
        this.name = שם;
        this.family = משפחה;
    }
}
