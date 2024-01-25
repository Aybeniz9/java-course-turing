package org.example;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if ((n % 2 == 0 && n > 0) || (n % 2 != 0 && n < 0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

        }
    }
}
