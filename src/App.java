import ocp.after.Animal;
import ocp.after.Cat;
import ocp.after.Dog;
import ocp.after.HelloAnimal;
import ocp.after.Sheep;
import ocp.after.Tiger;
import srp.after.Bathroom;
import srp.after.Morning;
import srp.after.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // SRP
        Morning morning = new Morning(new Person(new Bathroom()));
        morning.startActivity();

        // OCP
        // before
        // HelloAnimal hello = new HelloAnimal();

        // Animal cat = new Animal("Cat");
        // Animal dog = new Animal("Dog");

        // Animal sheep = new Animal("Sheep");
        // Animal lion = new Animal("Lion");

        // hello.hello(cat); 
        // hello.hello(dog); 
        // hello.hello(sheep); 
        // hello.hello(lion);

        // after
        HelloAnimal hello = new HelloAnimal();

        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal sheep = new Sheep();
        Animal tiger = new Tiger();

        hello.makeAnimalSound(cat); 
        hello.makeAnimalSound(dog); 
        hello.makeAnimalSound(sheep); 
        hello.makeAnimalSound(tiger);


    }
}
