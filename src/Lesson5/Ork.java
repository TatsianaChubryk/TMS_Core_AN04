package Lesson5;

public class Ork {
    private String race;
    private String armor;
    private String name;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ork (String race, String armor) {
        this.race = race;
        this.armor = armor;
    }

    public void orkKill() {
        System.out.println("Орк достал большой топор\n" +
                "Прокричал что-то невнятное\n" +
                "Снёс голову противнику\n" +
                "Прокричал что-то невнятное");
    }

}
