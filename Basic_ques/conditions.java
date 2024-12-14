package Basic_ques;
import java.util.*;

class conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");  //taking input from user for age 
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("You are not Adult");
        }
    }
}