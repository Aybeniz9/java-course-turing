package org.example;

import java.util.Scanner;

public class InsideInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (x<=Math.pow(10,9) &&a<=Math.pow(10,9)&& b<=Math.pow(10,9) ){
            if (x<=b&&x>=a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
