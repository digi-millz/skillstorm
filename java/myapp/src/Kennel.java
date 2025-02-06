//Arrays of Objects
public class Kennel {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (Animal a : animals) {
            a.speak();
        }
    }
}

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}