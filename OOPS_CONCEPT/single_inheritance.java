package OOPS_CONCEPT;

//Example of Single Inheritance in Java
class std{      //Super class
    int roll, marks;
    String name;
    void input(){
        System.out.println("Enter the roll no. and marks.");
    }
} 

class single_inheritance extends std{           //Sub class
    void display(){
        roll = 1;
        name = "Snkit";
        marks = 85;

        System.out.println(roll + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        single_inheritance obj = new single_inheritance();
        obj.input();
        obj.display();
    }
}

