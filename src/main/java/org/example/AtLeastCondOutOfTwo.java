package org.example;
import java.util.Scanner;
public class AtLeastCondOutOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2!=0){
            System.out.println("YES");}
            else if(n>100&& n<=999){
                System.out.println("YES");
            }
        else{
            System.out.println("NO");
        }
    }

}
