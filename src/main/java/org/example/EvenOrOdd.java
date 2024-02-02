package org.example;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= Math.pow(10, 9) && n >= 1) {
            if (n % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        } else {
            System.out.println("nvalid number");
        }
    }
}
