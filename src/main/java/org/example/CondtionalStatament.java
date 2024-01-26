package org.example;
import java.util.Scanner;

public class CondtionalStatament {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y=0;
        if(n <=Math.pow(10,3)&& n>=Math.pow(10,3)*(-1)) {
            if (n<5){
                 y=n*n-3*n+4;
                System.out.println(y);
            }
            else{
                 y=n+7;
                System.out.println(y);
            }
    }
        else {
            System.out.println("invalid number");
        }
}}