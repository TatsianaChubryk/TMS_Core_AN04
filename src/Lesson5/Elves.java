package Lesson5;

public class Elves extends Warrior {
    final String nameRace;
    final String weaponType;

    public Elves() {
        nameRace = "ЭЛЬФЫ";
        weaponType = "лук и стрелы";
    }

    @Override
    public void setNameRace(String nameRace) {
        nameRace = nameRace;
    }

    @Override
    public String getNameRace() {
        return nameRace;
    }

    @Override
    public void setWeaponType(String weaponType) {
        weaponType = weaponType;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    protected void takeWeapon() {
        System.out.println(nameRace);
        System.out.println("Достает " + weaponType + ", натягивает тетеву");
    }

    @Override
    protected void cry() {
        System.out.println("Что-то тихо произносит");
    }

    @Override
    protected void attacks() {
        System.out.println("Стреляет");
    }

    @Override
    protected void win() {
        System.out.println("Молчит");
    }
}
