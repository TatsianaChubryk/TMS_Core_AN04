package Lesson5;

public class Orcs extends Warrior {
    final String nameRace;
    final String weaponType;

    public Orcs() {
        nameRace = "ОРКИ";
        weaponType = "большой топор";
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
        System.out.println("Достает " + weaponType);
    }

    @Override
    protected void cry() {
        System.out.println("Кричит что-то невнятное");
    }

    @Override
    protected void attacks() {
        System.out.println("Сносит голову противнику");
    }

    @Override
    protected void win() {
        System.out.println("Кричит что-то невнятное");
    }
}
