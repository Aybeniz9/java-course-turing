package org.example;

import java.util.Scanner;

public class SeperatedNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i<=99&&i>=10){
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            System.out.println(firstDigit+" "+secondDigit);
        }

    }
}
