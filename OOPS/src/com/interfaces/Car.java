package com.interfaces;

public class Car implements Engine,Break{
    @Override
    public void brake() {
        System.out.println("Break applied");
    }

    @Override
    public void start() {
        System.out.println("Engine start..");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop..");
    }

    @Override
    public void accelerate() {
        System.out.println("Press accelerate");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brake();
        car.start();
        car.stop();
        car.accelerate();
    }
}
