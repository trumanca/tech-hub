package org.techhub.principle.l;

public class MotorCar implements Car {

    private Engine engine;

    public void turnOnEngine() {
        engine.on();
    }

    public void accelerate() {
        engine.powerOn(1000);
    }

}
