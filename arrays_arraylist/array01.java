package arrays_arraylist;

import java.util.*;

public class array01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 21;
        arr[1] = 23;
        arr[2] = 121;
        arr[3] = 221;
        arr[4] = 2901;

        System.out.println(arr[3]);

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }  

        //Array of objects
        String[] str = new String[4];
        for(int i=0; i<4; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));  

        str[1] = "Kapoor";      //Modify the string

        System.out.println(Arrays.toString(str));

    }
    
}
