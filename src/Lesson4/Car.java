package Lesson4;

public class Car {
    private Integer distance;
    final Engine engine;
    final Tank tank;
    private String carName;
    private Integer year;

    public Car (Engine engine, Tank tank) {
        this.carName = "";
        this.year = 0;
        this.distance = 0;
        this.engine = engine;
        this.tank = tank;
    }

    public Car (Engine engine, Tank tank, String brand, Integer year, Integer carDistance) {
        this.engine = engine;
        this.tank = tank;
        this.carName = brand;
        this.year = year;
        this.distance = carDistance;
    }

    public void setCarName(String name) {
        carName = name;
    }
    public String getCarName() {
        return carName;
    }

    public void setYear (Integer number) {
        year = number;
    }
    public Integer getYear() {
        return year;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    public Integer getAllDistance () {
        return distance;
    }

    public void carTurnOn() {
        if (tank.fuelAvailable() == true) {
           System.out.println("Бак наполнен");
            engine.startEngine();
        } else {
            System.out.println("Бак пустой");
        }
    }

    public void carTurnOff() {
        engine.stopEngine();
    }

    public void carRun() {
        if (engine.getIsEngineStart() == true) {
            System.out.println("Машина едет...");
            distance = distance;
        } else {
            System.out.println("Необходимо завести машину");
        }
    }

    public void addFuel(Integer quantity) {
        tank.addFuelQuantity(quantity);

    }

    public Integer fuelQuantity() {
        return tank.getFuelQuantity();
    }

    public String getCarInfo() {
        return "Марка машины: " + carName
                + "\nТип двигателя: " + engine.getEngineType()
                + "\nГод выпуска: " + year
                + "\nКоличество топлива: " + tank.getFuelQuantity()
                + "\nПройденная дистанция: " + distance;
    }

}

