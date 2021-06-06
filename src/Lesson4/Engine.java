package Lesson4;

public class Engine {

    private boolean engineStart = false;
    private String typeEngine = "";

    public void setTypeEngine(String type) {
        typeEngine = type;
    }
    public String getTypeEngine() {
        return typeEngine;
    }

        public Boolean getEngineStart () {
            return engineStart;
    }
    public void startEngine () {
        engineStart = true;
        System.out.println("Engine is starting...");
    }

    public void stopEngine () {
        engineStart = false;
        System.out.println("Engine is stopped...");
    }

}
