import java.util.*;

// abstract class
abstract class AnimalA { // since we won't directly make an object of Animal
    abstract public void walk(); // all child class must override abstract method

    AnimalA() {
        System.out.println("New Animal Created");
    }
}

class Horse extends AnimalA {
    Horse() {
        System.out.println("Horse create");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends AnimalA {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

// interfaces - pure abstraction (can't have constructors, non-abstract
// function)
interface AnimalI {
    // all fields in interfaces are public, static and final by default
    int eyes = 2; // it is already public and static(same for all animals) and final(can't be
                  // changed)

    // all methods are public & abstract by default
    void walk();

    // void eat() {} -> error. since,it is a non abstract class
}

interface Herbivore {

}

// multiple inheritance can be implemented using interfaces
class HorseI implements AnimalI, Herbivore { // interfaces are implemented not extended
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

        HorseI hI = new HorseI();
        hI.walk();
    }
}