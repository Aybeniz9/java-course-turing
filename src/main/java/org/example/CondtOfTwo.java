package org.example;

import java.util.Scanner;

public class CondtOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0){
            System.out.println("YES");}
        else if(n>=10&& n<=99){
            System.out.println("YES");
        } else if (n%3==0) {
            System.out.println("YES");

        } else{
            System.out.println("NO");
        }

    }
}
