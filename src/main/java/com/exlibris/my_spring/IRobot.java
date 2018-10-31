package com.exlibris.my_spring;

import com.exlibris.multiple_inheritance.Father;

import javax.annotation.PostConstruct;
import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {






        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
