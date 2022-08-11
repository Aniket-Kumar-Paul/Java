import java.util.*;
import bank.Account;

class Student {
    String reg;
    String name;
    int age;

    // constructor
    Student(String reg) {
        System.out.println("New Student Joined!!");
        this.reg = reg;
    }

    // copy constructor
    Student(Student s) {
        this.reg = s.reg;
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.name + " Age: " + this.age+" Reg no.: "+this.reg);
    }
}

class Shape {
    public void area() {
        System.out.println("Display area! ");
    }
}
// Inheritance
class Triangle extends Shape { // single level
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
// NOTE: we use interfaces to implement multiple inheritence in java

public class OOPS {
    // abstraction, encapsulation, inheritance, polymorphism

    // polymorphism - function overloading (compile time)
    //              - function overriding (run time)

    public static void main(String[] args) {
        Student s1 = new Student("20BRS1116");
        s1.name = "Aniket";
        s1.age = 20;
        s1.printInfo();

        // using bank package
        Account account1 = new Account();
        account1.name = "Aniket";
    }
}