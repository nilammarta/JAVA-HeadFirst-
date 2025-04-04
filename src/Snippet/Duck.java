package Snippet;

public class Duck implements Poultry, LandAnimal {
    public String makeSound() {
        return "kwek... kwek...";
    }

    @Override
    public void walk() {
        System.out.println("Duck can walk");
    }
}
