package org.example;

import java.util.Scanner;

public class NoneOfTheTwoCond {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();
            if ( (!(n%2==0 && n>0) && (!( n%2!=0 && n<0 )))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


