package Lesson5;

public class Undead extends Warrior {
    final String nameRace;
    final String weaponType;

    public Undead() {
        weaponType = "скелетов";
        nameRace = "НЕЖИТЬ";
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
        return this.weaponType;
    }

    @Override
    protected void takeWeapon() {
        System.out.println(nameRace);
        System.out.println("Призывает " + weaponType);
    }

    @Override
    protected void cry() {
        System.out.println("Устращающе хохочет");
    }

    @Override
    protected void attacks() {
        System.out.println("Посылает " + weaponType + " в бой");
    }

}
