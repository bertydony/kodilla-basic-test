package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private double speed;

    public Opel(double speed){
        this.speed=speed;
    }
    @Override
    public int increaseSpeed() {
        return (int) (speed*1.2);
    }

    @Override
    public int decreaseSpeed() {
        return (int) (speed*0.5);
    }
    @Override
    public int getSpeed() {
        return increaseSpeed() - decreaseSpeed();
    }
}
