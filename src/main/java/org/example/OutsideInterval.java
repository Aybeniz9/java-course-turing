package org.example;
import java.util.Scanner;

public class OutsideInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (x<=Math.pow(10,9) &&a<=Math.pow(10,9)&& b<=Math.pow(10,9) ){
            if (x<=b&&x>=a){
                System.out.println("IN");
            }
            else{
                System.out.println("OUT");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
