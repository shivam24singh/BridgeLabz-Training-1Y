package GenericProblem;

import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
        }
    }
}