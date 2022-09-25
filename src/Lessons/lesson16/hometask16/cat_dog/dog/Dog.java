package Lessons.lesson16.hometask16.cat_dog.dog;

import Lessons.lesson16.hometask16.cat_dog.animal.Animal;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("I am a Dog. My name is " + name + ". Gav");
    }
}
