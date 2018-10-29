package com.exlibris.strategy;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Knight implements Character {

    @Setter
    private Weapon weapon = new Sword();

    @Override
    public void kick(Character character) {
        weapon.kick(this,character);
    }
}
