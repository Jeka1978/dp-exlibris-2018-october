package com.exlibris.my_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Class = new HashMap<>();

    public JavaConfig() {
        ifc2Class.put(Speaker.class, ConsoleSpeaker.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2Class.get(type);
    }
}




