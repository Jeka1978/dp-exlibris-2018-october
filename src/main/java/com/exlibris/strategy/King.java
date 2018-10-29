package com.exlibris.strategy;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class King implements Character {

    @Setter
    private Weapon weapon = new Sword();

    @Override
    public void kick(Character character) {
        weapon.kick(this,character);
    }
}
