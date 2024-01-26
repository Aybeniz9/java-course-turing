package org.example;

import java.util.Scanner;

public class StreetNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= 1 && m <= 100) {
            if (n % 2 == 0 && m % 2 == 0 ||n % 2 != 0 && m % 2 != 0 ) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println("Invalid value");
        }
    }
}
