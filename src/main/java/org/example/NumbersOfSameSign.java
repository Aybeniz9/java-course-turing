package org.example;
import java.rmi.MarshalException;
import java.util.Scanner;
public class NumbersOfSameSign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if (n!=0&&n<= Math.pow(10,9) &&m!=0 && m<=Math.pow(10,9)){
            if(n>0&&m>0){
                System.out.println(1);
            }
            else System.out.println(0);
        }
        else System.out.println("not found");
    }
}
