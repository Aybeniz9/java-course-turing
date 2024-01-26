package org.example;
import java.util.Scanner;

public class DisibilityByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (n<=Math.pow(10,9) &&a<=Math.pow(10,9) &&b<=Math.pow(10,9) ){
            if (n%a==0&&n%b==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else System.out.println("Invalid");
    }

}
