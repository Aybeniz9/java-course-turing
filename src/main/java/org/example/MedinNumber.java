package org.example;
import java.util.Scanner;
public class MedinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <=1000&&a>=0 && b<=1000&&b>=0  && c<=1000&&c>=0 &&a!=b&a!=c&&b!=c) {
            System.out.println((a + b + c) / 3);
        }
else {
            System.out.println("Not Found");
        }
    }
}