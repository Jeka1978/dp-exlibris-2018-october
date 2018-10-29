package com.exlibris.lombok;

/**
 * @author Evgeny Borisov
 */
public class AlarmImpl implements Alarm {
    @Override
    public void stopAlarm() {
        System.out.println("20 lines of code");
    }

    @Override
    public void setTime() {

    }
}
