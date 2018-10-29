package com.exlibris.my_spring;

import lombok.Data;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandomInt(min=4,max=10)
    private int power;
    @InjectRandomInt(min=7,max=12)
    private int speed;


}
