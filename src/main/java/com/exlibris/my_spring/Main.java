package com.exlibris.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();
        ExlibriesService service = ObjectFactory.getInstance().createObject(ExlibriesService.class);
        service.drinkBeer();
        service.work();

    }
}
