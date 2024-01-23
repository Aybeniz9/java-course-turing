package org.example;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        String gradeName = null;

        if (grade <= 3 && grade >= 1) {
            gradeName = "Inital";
        } else if (grade <= 6) {
            gradeName = "Average";
        } else if (grade <= 9) {
            gradeName = "Sufficient";
        } else if (grade <= 12) {
            gradeName = "High";
        } else {
            System.out.println("Wrong grade");
        }
        System.out.println(gradeName);
    }

}