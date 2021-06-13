package Lesson6;

public class BlackDragon implements CharacterKillDragon{
    public static String blackDragon = "Черный дракон";

    @Override
    public boolean kill(String dragonRand) {
        System.out.println("Персонаж: - Я заберу твои сокровища, но прежде я тебя " + dragonRand);
        return false;
    }
}
