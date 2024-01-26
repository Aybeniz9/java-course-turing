package org.example;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();


        if (grade <= 3 && grade >= 1) {
            System.out.println("Inital");
        } else if (grade <= 6) {
            System.out.println("Average");
        } else if (grade <= 9) {
            System.out.println("Sufficient");
        } else if (grade <= 12) {
            System.out.println("High");
        } else {
            System.out.println("Wrong grade");
        }

    }

}