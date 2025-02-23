package ocp.before;

public class HelloAnimal {
    public void hello(Animal animal) {
        if(animal.type.equals("Cat")) {
            System.out.println("meow");
        } else if(animal.type.equals("Dog")) {
            System.out.println("bark");
        } else if (animal.type.equals("Sheep")) {
            System.out.println("meh eh eh");
        } else if (animal.type.equals("Lion")) {
            System.out.println("roar");
        }
    }
}
