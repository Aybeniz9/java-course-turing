package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    int firstDigit = num / 1000;

    int secondDigit= (num / 100) % 10;

    int thirdDigit= (num / 10) % 10;

    int fourthDigit= num % 10;
        System.out.println(firstDigit+fourthDigit);
}}
