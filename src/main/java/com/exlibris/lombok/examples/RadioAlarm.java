package com.exlibris.lombok.examples;

import com.exlibris.lombok.Alarm;
import com.exlibris.lombok.AlarmImpl;
import com.exlibris.lombok.Radio;
import com.exlibris.lombok.RadioImpl;
import lombok.ToString;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarm implements Radio, Alarm {
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate(excludes = AlarmExclusion.class)
    private Alarm alarm = new AlarmImpl();

    @Override
    public void stopAlarm() {

    }
}
