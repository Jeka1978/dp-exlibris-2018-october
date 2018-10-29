package com.exlibris.house_made_singletons;

import lombok.Getter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolver {
    private static MaamResolver ourInstance = new MaamResolver();

    public static MaamResolver getInstance() {
        return ourInstance;
    }

    @Getter
    private double maam;


    @SneakyThrows
    private MaamResolver() {
        Thread.sleep(5000);
        maam = 0.18;
    }
}
