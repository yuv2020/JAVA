 package OOPS_CONCEPT;

 //oops conceptually

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("I am writing using " );
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void information(){
        System.out.println( "Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    Student(Student s2){
        // System.out.println( "Constructor called ");
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){
        // System.out.println("Default constructor called");
    }
}

 public class basic {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student student1 = new Student();
        student1.name = "John";
        student1.age = 18;

        student1.information();

        Student s2 = new Student(student1);
        s2.information();
    }
 }