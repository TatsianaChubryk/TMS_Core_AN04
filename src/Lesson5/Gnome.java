package Lesson5;

public class Gnome {
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

    public Gnome (String race, String armor) {
        this.race = race;
        this.armor = armor;
    }

    public void GnomeKill() {
        System.out.println("Гном Достает топор\n" +
                "Заикаясь от эля бормочет клич\n" +
                "Рубит противника\n" +
                "Достает кружечку эля и радостно выпивает");
    }
}
