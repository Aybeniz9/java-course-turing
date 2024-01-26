package org.example;

import java.util.Scanner;

public class CondSt3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y=0;
        if(n <=100&& n>=-100) {
            if (n<-4){
                y=n+5;
                System.out.println(y);
            }
            if (n>=-4&&n<=7){
                y=n*n-3*n;
                System.out.println(y);
            }

            else{
                y=n*n*n+2*n;
                System.out.println(y);
            }
        }
        else {
            System.out.println("invalid number");
        }
    }}

