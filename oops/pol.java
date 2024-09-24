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
        Student s1 = new Student();
        s1.name = "rahul";
        s1.age = 67;

        s1.printing(s1.name, s1.age);    
    }
    
}
