package Lesson5;

public class Warrior {
    private String weaponType;
    private String nameRace;

    public void setNameRace(String nameRace) {
        this.nameRace = nameRace;
    }

    public String getNameRace() {
        return nameRace;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void killUp() {
        takeWeapon();
        cry();
        attacks();
        win();
    }

    protected void takeWeapon() {
        System.out.println(nameRace);
        System.out.println("Воин достает свое оружие" + weaponType);
    }

    protected void cry() {
        System.out.println("Произносит воинственный клич");
    }

    protected void attacks() {
        System.out.println("Атакует жертву своим оружием");
    }

    protected void win() {
        System.out.println("Празднует победу криком УРА-А_А_А");
    }
}
