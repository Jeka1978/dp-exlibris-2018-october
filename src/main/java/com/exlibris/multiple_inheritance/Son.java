package com.exlibris.multiple_inheritance;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Son implements Father, Mother {

    @Override
    public void speak() {
        Mother.super.speak();
    }
}
