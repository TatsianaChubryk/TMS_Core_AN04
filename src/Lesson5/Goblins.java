package Lesson5;

public class Goblins extends Warrior {
    final String nameRace;
    final String weaponType;

    public Goblins() {
        nameRace = "ГОБЛИНЫ";
        weaponType = "топор";
    }

    public void setNameRace(String nameRace) {
        nameRace = nameRace;
    }

    public String getNameRace() {
        return nameRace;
    }

    public void setWeaponType(String weaponType) {
       weaponType = weaponType;
    }

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
        System.out.println("Заикаясь от эля бормочет клич");
    }

    @Override
    protected void attacks() {
        System.out.println("Рубит противника");
    }

    @Override
    protected void win() {
        System.out.println("Достает кружечку эля и радостно выпивает");
    }
}
