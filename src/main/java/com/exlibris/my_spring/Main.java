package com.exlibris.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();
        ExlibriesServiceImpl service = ObjectFactory.getInstance().createObject(ExlibriesServiceImpl.class);
//        service.drinkBeer();
        service.work();

    }
}
