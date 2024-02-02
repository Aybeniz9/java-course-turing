package org.example;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (Math.abs(a) <= 1000 && Math.abs(b) <= 1000 && Math.abs(c) <= 1000 && a != b & a != c && b != c) {
            System.out.println((a + b + c) / 3);
        } else {
            System.out.println("Not Found");
        }
    }
}