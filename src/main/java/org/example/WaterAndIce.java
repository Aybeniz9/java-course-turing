package org.example;
import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t<=Math.pow(10,9) &&t>=-Math.pow(10,9) ){
            if (t>0){
                System.out.println("Water");
            }
            else {
                System.out.println("Ice");
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}
