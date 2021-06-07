package Lesson4;

public class Main {
    public static void main(String[] args) {

        //машина с наполненным баком
        Engine engine = new Engine();
        engine.setEngineType("DDVE");
        Tank tank = new Tank();
        Car audi = new Car(engine, tank);
        audi.setYear(2019);
        audi.setDistance(25);
        audi.setCarName("Audi A6");
        audi.addFuel(45);
        audi.carRun();
        audi.carTurnOn();
        audi.carRun();
        audi.carTurnOff();
        System.out.println(audi.getCarInfo());
        System.out.println();

        //машина с пустым баком
        Engine engineEmpty = new Engine();
        engine.setEngineType("DE");
        Tank tankEmpty = new Tank();
        Car audiEmpty = new Car(engineEmpty, tankEmpty);
        audiEmpty.setYear(2018);
        audiEmpty.setDistance(0);
        audiEmpty.setCarName("Audi A5");
        audiEmpty.addFuel(0);
        audiEmpty.carRun();
        audiEmpty.carTurnOn();
        audiEmpty.carTurnOff();
        System.out.println(audiEmpty.getCarInfo());
    }
}
