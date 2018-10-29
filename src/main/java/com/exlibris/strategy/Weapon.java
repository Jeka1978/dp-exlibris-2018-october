package com.exlibris.strategy;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Weapon {
    void kick(Character c1, Character c2);
}
