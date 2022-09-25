package Lessons.lesson13.abstractExample;

abstract class Car {
    String model;
    int year;

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    abstract void countWheels();

    {
        System.out.println("4");
    }
}
