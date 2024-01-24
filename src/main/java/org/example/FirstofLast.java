package org.example;
import java.util.Scanner;

public class FirstofLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int firstDigit = number / 100;
            int lastDigit = number %10;

            if (firstDigit > lastDigit) {
                System.out.println(firstDigit);
            } else if (lastDigit > firstDigit) {
                System.out.println( lastDigit);
            } else {
                System.out.println("=");
            }
        } else {
            System.out.println("Please enter a valid three-digit number.");
        }
    }
}
