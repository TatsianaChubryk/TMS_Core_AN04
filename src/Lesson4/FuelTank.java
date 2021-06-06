package Lesson4;

public class FuelTank {
    private Integer fuel = 0;

    public Boolean fuelInTank () {
        if (fuel > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public void addFuel (Integer quantity) {

        fuel = fuel + quantity;
    }

    public Integer getFuelQuantity () {

        return fuel;
    }
}
