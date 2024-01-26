package org.example;


import java.util.Scanner;

public class PostiveNegativeOrZero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= Math.pow(10, 9)) {
            if (n < 0) {
                System.out.println("Negative");
            } else if (n == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        }
    }
}

