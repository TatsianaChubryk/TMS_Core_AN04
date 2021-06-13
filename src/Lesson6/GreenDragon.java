package Lesson6;

public class GreenDragon implements CharacterKillDragon{
    public static String greenDragon = "Зеленый дракон";

    @Override
    public boolean kill(String dragonRand) {
        System.out.println("Персонаж: - Я заберу твои сокровища, но прежде я тебя убью " + dragonRand);
        return true;
    }
}
