package arrays_arraylist;

public class rollno {
    public static void main(String[] args){
        // Store a roll no.
        int r = 76;

        // Store a person's name
        String name = "John Doe";

        //Syntax to declare tha the array
        // datatype[] variable name = new datatype[size]
        int[] rollno = new int[5];

        // or you can directly declare
        int[] rollNumbers = {12, 34, 56, 78, 90};

        int [] ros; //declaration of array. ros is getting in the stack

        ros = new int[5];   //initialization of array actually here object is created in the heap memory allocation

        /*Arrays objects are in heap memory
        Heap objects are in continuos
        Heap memory is dynamic memory allocation
        Hence, arrays objects are in java may not be continuous
        */

        System.out.println(ros[1]);

        // In java primitives are only stored in stack memory.
        
        String[] str = new String[5];       //Internally working of objects.
        System.out.println(str[1]);

    }
    
}
