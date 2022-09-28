package Lessons.lesson13.abstractExample;

public class bmw extends Car {
    @Override
    String maxSpeed() {
        return null;
    }

    @Override
    void drive() {

    }

    @Override
    void brake() {

    }

    @Override
    void countWheels() {
    }

    public void aboutBmw() {
        System.out.println("this is bmw");
        System.out.println("Wheels count");
        countWheels();
    }
}
