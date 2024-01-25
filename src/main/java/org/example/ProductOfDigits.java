package org.example;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstDigit = num / 100;

        int secondDigit = (num / 10) % 10;

        int thirdDigit = num % 10;
        System.out.println(firstDigit * secondDigit * thirdDigit);
    }
}
