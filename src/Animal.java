class GeneralAnimal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends GeneralAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Animal {
    public static void main(String[] args) {
        // Polymorphism in action!
        GeneralAnimal myPet = new Dog(); 
        myPet.makeSound(); 
    }
}