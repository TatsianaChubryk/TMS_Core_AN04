package Lesson5;

public class Elf {
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

    public Elf(String race, String armor) {
        this.race = race;
        this.armor = armor;
    }

    public void ElfKill() {
        System.out.println("Эльф достает лук и стрелы, натягивает тетеву\n" +
                "Что-то тихо произносит\n" +
                "Стреляет\n" +
                "Молчит");
    }

}
