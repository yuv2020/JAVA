package OOPS_CONCEPT;

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse is walking on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Cat is walking on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Animal animal = new Animal();
        animal.walk(); // This will give an abstract method error.
    }
    
}
