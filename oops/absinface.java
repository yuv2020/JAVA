package oops;

interface Animal{
    public void walk();
    int eyes = 2;
}

interface Hervivore{

}

class Horse implements Animal, Hervivore{
    public void walk(){
        System.out.println("Horse can walk ");
    }

}
 
public class absinface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
