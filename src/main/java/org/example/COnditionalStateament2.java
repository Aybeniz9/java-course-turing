package org.example;

import java.util.Scanner;

public class COnditionalStateament2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long y = 0;
        if (n <= Math.pow(10, 4) && n >= Math.pow(10, 4) * (-1)) {
            if (n >= 10) {
                y = n * n * n + n * 5;
                System.out.println(y);
            } else {
                y = n * n - 2 * n + 4;
                System.out.println(y);
            }
        } else {
            System.out.println("invalid number");
        }
    }
}