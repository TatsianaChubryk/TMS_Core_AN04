package Lesson6;

public class RoomWithDragon {
    public static void main(String[] args) {
        String[] dragonRand = new String[]{BlackDragon.blackDragon, GreenDragon.greenDragon, RedDragon.redDragon};
        int n = (int)Math.floor(Math.random() * dragonRand.length);
        System.out.println("В комнате " + dragonRand[n]);

        if(dragonRand[n] == BlackDragon.blackDragon){
            killedDragon("усыплю навсегда", new BlackDragon());
        } else if (dragonRand[n] == GreenDragon.greenDragon){
            killedDragon("магией воды", new GreenDragon());
        } else if (dragonRand[n] == RedDragon.redDragon) {
            killedDragon("в рукопашном бою", new GreenDragon());
        }
        /*killedDragon("усыплю навсегда", new BlackDragon());
        killedDragon("магией воды", new RedDragon());
        killedDragon("в рукопашном бою", new GreenDragon());*/
    }



    private static void killedDragon(String weapon, CharacterKillDragon characterKillDragon) {
        System.out.println("Дракон: - Я не позволю тебе забрать мои сокровища!!!");
        System.out.println("Дракон: - Для этого тебе придется меня убить");
        boolean killed = characterKillDragon.kill(weapon);
        System.out.println(killed ? "Дракон побежден!!! Сокровища наши" : "Дракон убил персонажа");
        System.out.println();
    }
}
