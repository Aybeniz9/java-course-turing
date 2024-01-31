package org.example;
import java.util.Scanner;
public class SnakeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int a = 1;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = a++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[i][j] = a++;
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
