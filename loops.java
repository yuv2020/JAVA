import java.util.*;

public class loops{
public static void main(String[] args) {
    // for(int i=0; i<11; i++){
    //     System.out.print(i + " ");

    // }

    // int i=0;
    // while(i<11){
    //     System.out.print("using while condition" + i + " ");
    //     i++;
    // }

    // int j=0;

    // do{
    //     System.out.println("using do while " + j);
    //     j+=1;
    // }
    // while(j<11);

    //Print the first n natural no.s
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. for sum : ");  
     
    int n=sc.nextInt();
    int sum=0; 
    for(int i=1; i<=n; i++){
        sum+=i;
    }
    System.out.print(sum + " ");

    }
}