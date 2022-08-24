package com.kodilla.collections.interfaces.homework;

public class BMW implements Car{
    private double speed;

    public BMW(double speed){
        this.speed=speed;
    }
    @Override
    public int increaseSpeed() {
        return (int) (speed*1.5);
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
