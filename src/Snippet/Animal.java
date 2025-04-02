package Snippet;

abstract class Animal {
    public abstract void sound();
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Guk guk!");
    }
}