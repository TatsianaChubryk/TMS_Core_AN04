package Lesson4;
import Lesson4.Engine;
import Lesson4.FuelTank;

public class Car {
   private Integer distance;
   private Engine engine;
   private FuelTank tank;
   private String carBrand;
   private Integer year;


    public Car(Engine engine, FuelTank tank) {
        this.engine = engine;
        this.tank = tank;
        this.carBrand = carBrand;
        this.year = year;
        this.distance = 10;
        }
    public void setBrand (String name) {
        carBrand = name;
    }
    public String getBrand () {
        return carBrand;
    }

    public void setYear (Integer number) {
        year = number;
    }
    public Integer getYear () {
        return year;
    }

    public void setCarDistance(Integer distance) {
    }
    public Integer getAllDistance () {
        return distance;
    }

    public void carTurnOn () {
        if (tank.fuelInTank()) {
            System.out.println("Fuel available...");
            engine.startEngine();
        } else {
            System.out.println("Fuel tank is empty...");
        }
    }
    public void carTurnOff () {
        engine.stopEngine();
    }

    public void carRun () {
        if (engine.getEngineStart() == true) {
            System.out.println("Car is running...");
            distance = distance++;
        } else {
            System.out.println("Please, start engine...");
        }
    }
    public void addFuel (Integer quantity) {
        tank.addFuel(quantity);
    }

    public Integer fuelQuantity () {
        return tank.getFuelQuantity();
    }

    public String getCarInfo () {
        return "Brand: " + carBrand
                + "\nYear: " + year
                + "\nAll Distance: " + getAllDistance ()
                + "\nFuel quantity: " + fuelQuantity ()
                + "\nType engine: " + engine.getTypeEngine();
    }

}

