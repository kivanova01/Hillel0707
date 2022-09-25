package Lessons.lesson16.hometask16.main;

import Lessons.lesson16.hometask16.cat_dog.animal.Animal;
import Lessons.lesson16.hometask16.cat_dog.cat.Cat;
import Lessons.lesson16.hometask16.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
//            expected:I 'am a Doc. My name is Tuzik. Gav
//            expected:I 'am a Cat. My name Vasya. Mew
        }
    }
}
