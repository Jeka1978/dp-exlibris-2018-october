package com.exlibris.strategy;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public void kick(Character c1, Character c2) {
        System.out.println("sword is my fighting strategy");
    }
}
