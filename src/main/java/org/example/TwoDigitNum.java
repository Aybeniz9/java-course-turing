package org.example;

import java.util.Scanner;
public class TwoDigitNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (Math.abs(n)<=99&&Math.abs(n)>=10){
            System.out.println("Ok");
        }
        else {
            System.out.println("No");
        }

    }
    }

