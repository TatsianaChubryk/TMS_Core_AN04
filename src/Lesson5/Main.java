package Lesson5;

public class Main {
    public static void main(String[] args) {
        Undead warriorUndead = new Undead();
        warriorUndead.killUp();
        System.out.println();

        Orcs warriorOrcs = new Orcs();
        warriorOrcs.killUp();
        System.out.println();

        Elves warriorElves = new Elves();
        warriorElves.killUp();
        System.out.println();

        Goblins warriorGoblins = new Goblins();
        warriorGoblins.killUp();
    }
}
