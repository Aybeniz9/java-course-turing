package org.example;
import java.util.Scanner;
public class MinOrMaxApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>=0&&b>=0&& a<=Math.pow(10,9)&&b<=Math.pow(10,9)){
            if (a<b){
                System.out.println(a+" "+b);
            }
            else {
                System.out.println(b+" "+a);
            }
        }
        else {
            System.out.println("Invalid number");
        }

    }
}
