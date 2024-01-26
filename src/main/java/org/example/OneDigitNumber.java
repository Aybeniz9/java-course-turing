package org.example;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if (n>=-9&&n<=9){
           System.out.println("Ok");
       }
       else {
           System.out.println("No");
       }

       }
    }

