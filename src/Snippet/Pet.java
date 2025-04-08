package Snippet;

public class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("This animal makes a sound (generic)");
    }
}


class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age); // calling the Pet constructor using super keyword
    }

    public void makeSound() {
        super.makeSound(); // calling the makeSound() implementation of Pet
        System.out.println("GROWFF... GROWFF...GROWFF...");
    }
}
