package org.example;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b <= Math.pow(10, 9) && a >= 1) {
            if (a % b != 0) {
                System.out.println(a / b + " " + a % b);
            } else {
                System.out.println("Divisible");
            }

        } else {
            System.out.println("Not Valid");
        }

    }
}
