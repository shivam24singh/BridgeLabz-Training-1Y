package GenericProblem;

class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        System.out.println(fruit.getClass().getSimpleName());
    }
}