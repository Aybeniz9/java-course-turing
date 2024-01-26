package org.example;

import java.util.Scanner;

public class MaxAmoungFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = a;
        if (a <= 1000 && b <= 1000 && c <= 1000 && d <= 1000) {
            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            if (d > max) {
                max = d;
            }

            System.out.println(max);

        } else {
            System.out.println("invalid numbers");
        }

    }
}
