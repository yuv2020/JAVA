package oops;

abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat is sitting");
    }
    public void walk(){    
        System.out.println("Cat is walking");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse is walking");
    }
}

// Use the abstraction
public class abs {
    public static void main(String[] args) throws Exception {
        Cat c = new Cat();
        c.walk();
        
    }
    
}
