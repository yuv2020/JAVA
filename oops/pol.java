package oops;

// Example of polymorphism in Java

class Student{
    String name;
    int age;
    public void printing(String name){
        System.out.println("name of person: " + name); 
    }

    public void printing(int age){
        System.out.println("Age of person is: " + age); 
    }

    public void printing(String name, int age){
        System.out.println("Name and age os person is: " + name + " " + age); 
    }
}

public class pol {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "rahul";
        s.age = 67;

        s.printing(s.age);    
    }
    
}
