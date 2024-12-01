package OOPS_CONCEPT;

//Implement the polymorhism interface

// Compile Time Polymorphism Code

class Student{
    String name;
    int age;

    public void information(){
        System.out.println(name);
    }

    public void information(int age){
        System.out.println(age);
    }

    public void information(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class polymorphism {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.age = 18;

        // Student s2 = new Student();
        s1.information(s1.name, s1.age);

    }
    
}
