package oops;

// Class and objects.

class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Please write something ");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void information(){
        System.out.println( "The name is: " + this.name);
        System.out.println("The age is: " + this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class obj {
    public static void main(String[] args) {
        // pen p1 = new pen();
        // p1.color = "blue";
        // p1.type = "gel";

        // p1.write();

        // pen p2 = new pen();
        // p2.color = "red";
        // p2.type = "ball";

        // p1.printcolor();
        // p2.printcolor();

        Student s1 = new Student("aman", 6);
        // s1.name = "John";
        // s1.age = 20;

        s1.information();
    }
}
