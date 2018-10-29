package com.exlibris.strategy;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        King king = new King();
        knight.kick(king);
        knight.kick(king);
        knight.kick(king);
        knight.setWeapon((c1, c2) -> System.out.println("knife is my strategy"));
        knight.kick(king);
    }
}
