package patterns;

public class floyd {
    public static void main(String[] args) {
        int n=6;
        int number = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }

        System.out.println();

        //Print the 0 & 1 triangle
        int a=5;
        for(int i=1; i<=a; i++){ //outer loop
            for(int j=1; j<=i; j++){  //inner loop
                int sum = i+j;
                if(sum%2==0){  //check even
                    System.out.print(1+" ");
                }
                else{ //check odd
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        } 
    }
    
}
