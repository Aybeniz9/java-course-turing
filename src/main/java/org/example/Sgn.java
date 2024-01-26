package org.example;
import java.util.Scanner;

public class Sgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = sgn(x);
        System.out.println( result);
    }

    private static int sgn(int x) {
        if (x <= Math.pow(10, 9) && x >= -Math.pow(10, 9)) {
            if (x > 0) {
                return 1;
            } else if (x < 0) {
                return -1;
            } else {
                return 0;
            }
        } else {
            System.out.println("invalid");
        }
        return x;
    }}
