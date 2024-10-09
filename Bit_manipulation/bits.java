
package Bit_manipulation;

import java.util.*;

public class bits {

    public static void main(String[] args){

        //Get Bit Operator
        int n=5; //0101
        int p=3;
        int bitmask = 1<<p;

        // for get bit

        // if((bitmask & n)==0){
        //     System.out.println("Bit was zero");
        // }

        // else{
        //     System.out.println("Bit was not zero");
        // }

        //for set bit

        // int setBit = n | bitmask;
        // System.out.println("Decimal no. is: " + setBit);
        // System.out.println("Set bit: " + Integer.toBinaryString(setBit));

        //FOR CLEAR BIT
        int clearBit = n & ~bitmask;
        System.out.println("Decimal no. is: " + clearBit);
        System.out.println("Clear bit: " + Integer.toBinaryString(clearBit));


    }
}