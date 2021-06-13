package Lesson6;

public class RedDragon implements CharacterKillDragon{
    public static String redDragon = "Красный дракон";

    @Override
    public boolean kill(String dragonRand) {
        System.out.println("Персонаж: - Я заберу твои сокровища, но прежде я тебя убью " + dragonRand);
        return true;
    }
}
