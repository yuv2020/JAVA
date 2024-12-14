package Basic_ques;
// Highest Grade of branches
import java.util.*;

public class foe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students placed in CSE: ");
        int c = sc.nextInt();

        System.out.print("Enter the number of students placed in ECE: ");
        int e = sc.nextInt();

        System.out.print("Enter the number of students placed in MTECH: ");
        int m = sc.nextInt();

        if(c<0 || e<0 || m<0){
            System.out.print(" Input is Invalid ");
        }

        else{
            if(c == e && e == m && m == c){
                System.out.print("None of the branches having highest placements");
            }
            else if(c == e && c>m){
                System.out.println("Hightest Placements: ");
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if(c == m && c > e){
                System.out.println("Hightest Placements: ");
                System.out.println("CSE");
                System.out.println("MTECH");
            } 
            else if(e==m && e>c){
                System.out.println("Highest Placements: ");
                System.out.println("ECE");
                System.out.println("MTECH");
            }
            else if(m==e && m>c){
                System.out.println("Highest Placements: ");
                System.out.println("MTECH");
                System.out.println("ECE");
            }
            else if(m>e && m>c){
                System.out.println("Highest Placements: ");
                System.out.println("MTECH");
            }

            else if(e>c){
                System.out.println("Highest Placements: ");
                System.out.println("ECE");
            }
            else{
                System.out.println("Highest Placements: ");
                System.out.println("CSE");
            }
        }




    }
    
}
